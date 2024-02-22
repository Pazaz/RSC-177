package jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!a/g")
public final class WordFilter {

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "Z")
	private static boolean VERBOSE;

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "Z")
	private static boolean DEBUG;

	@OriginalMember(owner = "mudclient!a/g", name = "e", descriptor = "[I")
	private static int[] fragments;

	@OriginalMember(owner = "mudclient!a/g", name = "f", descriptor = "[[C")
	private static char[][] badWords;

	@OriginalMember(owner = "mudclient!a/g", name = "g", descriptor = "[[[B")
	private static byte[][][] badCombinations;

	@OriginalMember(owner = "mudclient!a/g", name = "h", descriptor = "[[C")
	private static char[][] hosts;

	@OriginalMember(owner = "mudclient!a/g", name = "i", descriptor = "[[[B")
	private static byte[][][] hostCombinations;

	@OriginalMember(owner = "mudclient!a/g", name = "j", descriptor = "[[C")
	private static char[][] tlds;

	@OriginalMember(owner = "mudclient!a/g", name = "k", descriptor = "[I")
	private static int[] tldType;

	@OriginalMember(owner = "mudclient!a/g", name = "c", descriptor = "Z")
	private static boolean POST_FILTER = true;

	@OriginalMember(owner = "mudclient!a/g", name = "d", descriptor = "I")
	private static int anInt273 = 3;

	@OriginalMember(owner = "mudclient!a/g", name = "l", descriptor = "[Ljava/lang/String;")
	private static String[] ALLOWLIST = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(Lmudclient!a/d;Lmudclient!a/d;Lmudclient!a/d;Lmudclient!a/d;)V")
	public static void read(@OriginalArg(0) Packet fragments, @OriginalArg(1) Packet bad, @OriginalArg(2) Packet host, @OriginalArg(3) Packet tld) {
		readBadWords(bad);
		readHosts(host);
		readFragments(fragments);
		readTld(tld);
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(Lmudclient!a/d;)V")
	private static void readTld(@OriginalArg(0) Packet buf) {
		@Pc(4) int count = buf.g4();
		tlds = new char[count][];
		tldType = new int[count];

		for (@Pc(12) int i = 0; i < count; i++) {
			tldType[i] = buf.g1();

			@Pc(23) char[] tld = new char[buf.g1()];
			for (@Pc(25) int j = 0; j < tld.length; j++) {
				tld[j] = (char) buf.g1();
			}

			tlds[i] = tld;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "(Lmudclient!a/d;)V")
	private static void readBadWords(@OriginalArg(0) Packet buf) {
		@Pc(2) int count = buf.g4();
		badWords = new char[count][];
		badCombinations = new byte[count][][];
		readCombinations(buf, badWords, badCombinations);
	}

	@OriginalMember(owner = "mudclient!a/g", name = "c", descriptor = "(Lmudclient!a/d;)V")
	private static void readHosts(@OriginalArg(0) Packet buf) {
		@Pc(2) int count = buf.g4();
		hosts = new char[count][];
		hostCombinations = new byte[count][][];
		readCombinations(buf, hosts, hostCombinations);
	}

	@OriginalMember(owner = "mudclient!a/g", name = "d", descriptor = "(Lmudclient!a/d;)V")
	private static void readFragments(@OriginalArg(0) Packet buf) {
		fragments = new int[buf.g4()];
		for (@Pc(5) int i = 0; i < fragments.length; i++) {
			fragments[i] = buf.g2();
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(Lmudclient!a/d;[[C[[[B)V")
	private static void readCombinations(@OriginalArg(0) Packet buf, @OriginalArg(1) char[][] words, @OriginalArg(2) byte[][][] combinations) {
		for (@Pc(3) int i = 0; i < words.length; i++) {
			@Pc(9) char[] word = new char[buf.g1()];
			for (@Pc(11) int j = 0; j < word.length; j++) {
				word[j] = (char) buf.g1();
			}

			words[i] = word;

			@Pc(33) byte[][] combination = new byte[buf.g4()][2];
			for (@Pc(35) int j = 0; j < combination.length; j++) {
				combination[j][0] = (byte) buf.g1();
				combination[j][1] = (byte) buf.g1();
			}

			if (combination.length > 0) {
				combinations[i] = combination;
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String filter(@OriginalArg(0) String str) {
		@Pc(5) char[] chars = str.toLowerCase().toCharArray();

		filterTld(chars);
		filterBad(chars);
		filterHost(chars);
		filterFragments(chars);

		for (@Pc(15) int i = 0; i < ALLOWLIST.length; i++) {
			@Pc(19) int allowedIndex = -1;

			while ((allowedIndex = str.indexOf(ALLOWLIST[i], allowedIndex + 1)) != -1) {
				@Pc(26) char[] allowed = ALLOWLIST[i].toCharArray();

				for (@Pc(28) int j = 0; j < allowed.length; j++) {
					chars[j + allowedIndex] = allowed[j];
				}
			}
		}

		if (POST_FILTER) {
			replaceUpperCase(str.toCharArray(), chars);
			formatUpperCase(chars);
		}

		return new String(chars);
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([C[C)V")
	private static void replaceUpperCase(@OriginalArg(0) char[] unfiltered, @OriginalArg(1) char[] input) {
		for (@Pc(1) int i = 0; i < unfiltered.length; i++) {
			if (input[i] != '*' && isUpperCase(unfiltered[i])) {
				input[i] = unfiltered[i];
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([C)V")
	private static void formatUpperCase(@OriginalArg(0) char[] arg0) {
		@Pc(3) boolean upper = true;
		for (@Pc(5) int i = 0; i < arg0.length; i++) {
			@Pc(11) char c = arg0[i];

			if (!isAlpha(c)) {
				upper = true;
			} else if (upper) {
				if (isLowerCase(c)) {
					upper = false;
				}
			} else if (isUpperCase(c)) {
				arg0[i] = (char) (c + 'a' - 65);
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "([C)V")
	private static void filterBad(@OriginalArg(0) char[] input) {
		for (@Pc(3) int passes = 0; passes < 2; passes++) {
			for (@Pc(10) int i = badWords.length - 1; i >= 0; i--) {
				filter(input, badWords[i], badCombinations[i]);
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "c", descriptor = "([C)V")
	private static void filterHost(@OriginalArg(0) char[] input) {
		for (@Pc(4) int i = hosts.length - 1; i >= 0; i--) {
			filter(input, hosts[i], hostCombinations[i]);
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "d", descriptor = "([C)V")
	private static void filterTld(@OriginalArg(0) char[] input) {
		@Pc(3) char[] filteredDot = input.clone();
		@Pc(18) char[] dot = new char[] { 'd', 'o', 't' };
		filter(filteredDot, dot, null);

		@Pc(26) char[] filteredSlash = input.clone();
		@Pc(49) char[] slash = new char[] { 's', 'l', 'a', 's', 'h' };
		filter(filteredSlash, slash, null);

		for (@Pc(55) int i = 0; i < tlds.length; i++) {
			filterTld(input, filteredDot, filteredSlash, tlds[i], tldType[i]);
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([C[C[C[CI)V")
	private static void filterTld(@OriginalArg(0) char[] chars, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] tld, @OriginalArg(4) int type) {
		if (tld.length > chars.length) {
			return;
		}

		for (@Pc(9) int start = 0; start <= chars.length - tld.length; start++) {
			@Pc(13) int end = start;
			@Pc(15) int offset = 0;

			label120: while (true) {
				while (true) {
					if (end >= chars.length) {
						break label120;
					}

					@Pc(23) char b = chars[end];
					@Pc(25) char c = 0;

					if (end + 1 < chars.length) {
						c = chars[end + 1];
					}

					@Pc(49) int charLen;
					if (offset < tld.length && (charLen = getEmulatedDomainCharSize(tld[offset], b, c)) > 0) {
						end += charLen;
						offset++;
					} else {
						if (offset == 0) {
							break label120;
						}

						@Pc(69) int charLen2;
						if ((charLen2 = getEmulatedDomainCharSize(tld[offset - 1], b, c)) > 0) {
							end += charLen2;
						} else {
							if (offset >= tld.length || !isSymbol(b)) {
								break label120;
							}

							end++;
						}
					}
				}
			}

			if (offset >= tld.length) {
				@Pc(95) boolean match = false;
				@Pc(100) int startMatch = getTldDotFilterStatus(chars, arg1, start);
				@Pc(107) int endMatch = getTldSlashFilterStatus(chars, arg2, end - 1);

				if (VERBOSE) {
					System.out.println("Potential tld: " + tld + " at char " + start + " (type=" + type + ", startmatch=" + startMatch + ", endmatch=" + endMatch + ")");
				}

				if (type == 1 && startMatch > 0 && endMatch > 0) {
					match = true;
				}

				if (type == 2 && (startMatch > 2 && endMatch > 0 || startMatch > 0 && endMatch > 2)) {
					match = true;
				}

				if (type == 3 && startMatch > 0 && endMatch > 2) {
					match = true;
				}

				@Pc(179) boolean lastCheck;
				if (type == 3 && startMatch > 2 && endMatch > 0) {
					lastCheck = true;
				} else {
					lastCheck = false;
				}

				if (match) {
					if (VERBOSE) {
						System.out.println("Filtered tld: " + tld + " at char " + start);
					}

					@Pc(201) int first = start;
					@Pc(205) int last = end - 1;
					@Pc(213) boolean findStart;
					@Pc(217) int i;

					if (startMatch > 2) {
						if (startMatch == 4) {
							findStart = false;

							for (i = start - 1; i >= 0; i--) {
								if (findStart) {
									if (arg1[i] != '*') {
										break;
									}

									first = i;
								} else if (arg1[i] == '*') {
									first = i;
									findStart = true;
								}
							}
						}

						findStart = false;
						for (i = first - 1; i >= 0; i--) {
							if (findStart) {
								if (isSymbol(chars[i])) {
									break;
								}

								first = i;
							} else if (!isSymbol(chars[i])) {
								findStart = true;
								first = i;
							}
						}
					}

					if (endMatch > 2) {
						if (endMatch == 4) {
							findStart = false;
							for (i = last + 1; i < chars.length; i++) {
								if (findStart) {
									if (arg2[i] != '*') {
										break;
									}

									last = i;
								} else if (arg2[i] == '*') {
									last = i;
									findStart = true;
								}
							}
						}

						findStart = false;
						for (i = last + 1; i < chars.length; i++) {
							if (findStart) {
								if (isSymbol(chars[i])) {
									break;
								}

								last = i;
							} else if (!isSymbol(chars[i])) {
								findStart = true;
								last = i;
							}
						}
					}

					for (@Pc(347) int j = first; j <= last; j++) {
						chars[j] = '*';
					}
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([C[CI)I")
	private static int getTldDotFilterStatus(@OriginalArg(0) char[] a, @OriginalArg(1) char[] b, @OriginalArg(2) int start) {
		if (start == 0) {
			return 2;
		}

		@Pc(9) int cur = start - 1;
		while (true) {
			if (cur >= 0 && isSymbol(a[cur])) {
				if (a[cur] != ',' && a[cur] != '.') {
					cur--;
					continue;
				}
				return 3;
			}

			@Pc(33) int asteriskCount = 0;
			for (@Pc(37) int i = start - 1; i >= 0 && isSymbol(b[i]); i--) {
				if (b[i] == '*') {
					asteriskCount++;
				}
			}

			if (asteriskCount >= 3) {
				return 4;
			}

			if (isSymbol(a[start - 1])) {
				return 1;
			}

			return 0;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "([C[CI)I")
	private static int getTldSlashFilterStatus(@OriginalArg(0) char[] a, @OriginalArg(1) char[] b, @OriginalArg(2) int end) {
		if (end + 1 == a.length) {
			return 2;
		}

		@Pc(13) int cur = end + 1;
		while (true) {
			if (cur < a.length && isSymbol(a[cur])) {
				if (a[cur] != '\\' && a[cur] != '/') {
					cur++;
					continue;
				}

				return 3;
			}

			@Pc(39) int asteriskCount = 0;
			for (@Pc(43) int i = end + 1; i < a.length && isSymbol(b[i]); i++) {
				if (b[i] == '*') {
					asteriskCount++;
				}
			}

			if (asteriskCount >= 5) {
				return 4;
			}

			if (isSymbol(a[end + 1])) {
				return 1;
			}

			return 0;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([C[C[[B)V")
	private static void filter(@OriginalArg(0) char[] input, @OriginalArg(1) char[] fragment, @OriginalArg(2) byte[][] badCombinations) {
		if (fragment.length > input.length) {
			return;
		}

		for (@Pc(9) int start = 0; start <= input.length - fragment.length; start++) {
			@Pc(13) int end = start;
			@Pc(15) int fragOff = 0;
			@Pc(17) boolean bad = false;
			@Pc(25) char b;
			@Pc(27) char c;

			label118: while (true) {
				while (true) {
					if (end >= input.length) {
						break label118;
					}

					b = input[end];
					c = '\u0000';
					if (end + 1 < input.length) {
						c = input[end + 1];
					}

					@Pc(51) int charLen;
					if (fragOff < fragment.length && (charLen = getEmulatedSize(fragment[fragOff], b, c)) > 0) {
						end += charLen;
						fragOff++;
					} else {
						if (fragOff == 0) {
							break label118;
						}

						@Pc(71) int charLen2;
						if ((charLen2 = getEmulatedSize(fragment[fragOff - 1], b, c)) > 0) {
							end += charLen2;
						} else {
							if (fragOff >= fragment.length || !isLowerCaseAlpha(b)) {
								break label118;
							}

							if (isSymbol(b) && b != '\'') {
								bad = true;
							}

							end++;
						}
					}
				}
			}

			if (fragOff >= fragment.length) {
				@Pc(105) boolean isSymbol = true;
				if (VERBOSE) {
					System.out.println("Potential word: " + fragment + " at char " + start);
				}

				if (bad) {
					@Pc(163) boolean badCurrent = false;
					@Pc(165) boolean badNext = false;

					if (start - 1 < 0 || isSymbol(input[start - 1]) && input[start - 1] != '\'') {
						badCurrent = true;
					}

					if (end >= input.length || isSymbol(input[end]) && input[end] != '\'') {
						badNext = true;
					}

					if (!badCurrent || !badNext) {
						@Pc(207) boolean good = false;
						@Pc(211) int cur = start - 2;
						if (badCurrent) {
							cur = start;
						}

						while (!good && cur < end) {
							if (cur >= 0 && (!isSymbol(input[cur]) || input[cur] == '\'')) {
								@Pc(232) char[] frag = new char[3];

								@Pc(234) int off;
								for (off = 0; off < 3 && cur + off < input.length && (!isSymbol(input[cur + off]) || input[cur + off] == '\''); off++) {
									frag[off] = input[cur + off];
								}

								@Pc(271) boolean valid = true;

								if (off == 0) {
									valid = false;
								}

								if (off < 3 && cur - 1 >= 0 && (!isSymbol(input[cur - 1]) || input[cur - 1] == '\'')) {
									valid = false;
								}

								if (valid && !isBadFragment(frag)) {
									good = true;
								}
							}
							cur++;
						}

						if (!good) {
							isSymbol = false;
						}
					}
				} else {
					b = ' ';
					if (start - 1 >= 0) {
						b = input[start - 1];
					}

					c = ' ';
					if (end < input.length) {
						c = input[end];
					}

					@Pc(147) byte bIndex = getIndex(b);
					@Pc(150) byte cIndex = getIndex(c);

					if (badCombinations != null && comboMatches(badCombinations, bIndex, cIndex)) {
						isSymbol = false;
					}
				}

				if (isSymbol) {
					if (DEBUG) {
						System.out.println("Filtered word: " + fragment + " at char " + start);
					}

					for (@Pc(334) int i = start; i < end; i++) {
						input[i] = '*';
					}
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([[BBB)Z")
	private static boolean comboMatches(@OriginalArg(0) byte[][] combo, @OriginalArg(1) byte a, @OriginalArg(2) byte b) {
		@Pc(1) int first = 0;
		if (combo[first][0] == a && combo[first][1] == b) {
			return true;
		}

		@Pc(22) int last = combo.length - 1;
		if (combo[last][0] == a && combo[last][1] == b) {
			return true;
		}

		do {
			@Pc(44) int middle = (first + last) / 2;
			if (combo[middle][0] == a && combo[middle][1] == b) {
				return true;
			}

			if (a < combo[middle][0] || a == combo[middle][0] && b < combo[middle][1]) {
				last = middle;
			} else {
				first = middle;
			}
		} while (first != last && first + 1 != last);

		return false;
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(CCC)I")
	private static int getEmulatedDomainCharSize(@OriginalArg(0) char a, @OriginalArg(1) char b, @OriginalArg(2) char c) {
		if (a == b) {
			return 1;
		} else if (a == 'e' && b == '3') {
			return 1;
		} else if (a == 't' && (b == '7' || b == '+')) {
			return 1;
		} else if (a == 'a' && (b == '4' || b == '@')) {
			return 1;
		} else if (a == 'o' && b == '0') {
			return 1;
		} else if (a == 'i' && b == '1') {
			return 1;
		} else if (a == 's' && b == '5') {
			return 1;
		} else if (a == 'f' && b == 'p' && c == 'h') {
			return 2;
		} else if (a == 'g' && b == '9') {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "(CCC)I")
	private static int getEmulatedSize(@OriginalArg(0) char a, @OriginalArg(1) char b, @OriginalArg(2) char c) {
		if (a == '*') {
			return 0;
		} else if (a == b) {
			return 1;
		} else {
			if (a >= 'a' && a <= 'z') {
				if (a == 'e') {
					if (b == '3') {
						return 1;
					}

					return 0;
				} else if (a == 't') {
					if (b == '7') {
						return 1;
					}

					return 0;
				} else if (a == 'a') {
					if (b != '4' && b != '@') {
						return 0;
					}

					return 1;
				} else if (a == 'o') {
					if (b != '0' && b != '*') {
						if (b == '(' && c == ')') {
							return 2;
						}

						return 0;
					}

					return 1;
				} else if (a == 'i') {
					if (b != 'y' && b != 'l' && b != 'j' && b != '1' && b != '!' && b != ':' && b != ';') {
						return 0;
					}

					return 1;
				} else if (a == 'n') {
					return 0;
				} else if (a == 's') {
					if (b != '5' && b != 'z' && b != '$') {
						return 0;
					}

					return 1;
				} else if (a == 'r') {
					return 0;
				} else if (a == 'h') {
					return 0;
				} else if (a == 'l') {
					if (b == '1') {
						return 1;
					}

					return 0;
				} else if (a == 'd') {
					return 0;
				} else if (a == 'c') {
					if (b == '(') {
						return 1;
					}

					return 0;
				} else if (a == 'u') {
					if (b == 'v') {
						return 1;
					}

					return 0;
				} else if (a == 'm') {
					return 0;
				} else if (a == 'f') {
					if (b == 'p' && c == 'h') {
						return 2;
					}

					return 0;
				} else if (a == 'p') {
					return 0;
				} else if (a == 'g') {
					if (b != '9' && b != '6') {
						return 0;
					}

					return 1;
				} else if (a == 'w') {
					if (b == 'v' && c == 'v') {
						return 2;
					}

					return 0;
				} else if (a == 'y') {
					return 0;
				} else if (a == 'b') {
					if (b == '1' && c == '3') {
						return 2;
					}

					return 0;
				} else if (a == 'v') {
					return 0;
				} else if (a == 'k') {
					return 0;
				} else if (a == 'x') {
					if (b == ')' && c == '(') {
						return 2;
					}

					return 0;
				} else if (a == 'j') {
					return 0;
				} else if (a == 'q') {
					return 0;
				} else if (a == 'z') {
					return 0;
				}
			} else if (a >= '0' && a <= '9') {
				if (a == '0') {
					if (b != 'o' && b != 'O') {
						if (b == '(' && c == ')') {
							return 2;
						}
						return 0;
					}
					return 1;
				} else if (a == '1') {
					if (b == 'l') {
						return 1;
					}

					return 0;
				} else if (a == '2') {
					return 0;
				} else if (a == '3') {
					return 0;
				} else if (a == '4') {
					return 0;
				} else if (a == '5') {
					return 0;
				} else if (a == '6') {
					return 0;
				} else if (a == '7') {
					return 0;
				} else if (a == '8') {
					return 0;
				} else if (a == '9') {
					return 0;
				}
			}

			if (a == '-') {
				return 0;
			} else if (a == ',') {
				return b == '.' ? 1 : 0;
			} else if (a == '.') {
				return b == ',' ? 1 : 0;
			} else if (a == '(') {
				return 0;
			} else if (a == ')') {
				return 0;
			} else if (a == '!') {
				return b == 'i' ? 1 : 0;
			} else if (a == '\'') {
				return 0;
			} else {
				if (DEBUG) {
					System.out.println("Letter=" + a + " not matched");
				}

				return 0;
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(C)B")
	private static byte getIndex(@OriginalArg(0) char c) {
		if (c >= 'a' && c <= 'z') {
			return (byte) (c + 1 - 'a');
		} else if (c == '\'') {
			return 28;
		} else if (c >= '0' && c <= '9') {
			return (byte) (c + 29 - '0');
		} else {
			return 27;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "e", descriptor = "([C)V")
	private static void filterFragments(@OriginalArg(0) char[] input) {
		@Pc(5) int end = 0;
		@Pc(7) int count = 0;
		@Pc(9) int start = 0;

		while (true) {
			do {
				@Pc(104) int index;
				if ((index = indexOfNumber(input, end)) == -1) {
					return;
				}

				@Pc(13) boolean foundLowercase = false;
				for (@Pc(15) int i = end; i >= 0 && i < index && !foundLowercase; i++) {
					if (!isSymbol(input[i]) && !isLowerCaseAlpha(input[i])) {
						foundLowercase = true;
					}
				}

				if (foundLowercase) {
					count = 0;
				}

				if (count == 0) {
					start = index;
				}

				end = indexOfNonNumber(input, index);
				@Pc(51) int hash = 0;
				for (@Pc(53) int i = index; i < end; i++) {
					hash = hash * 10 + input[i] - 48;
				}

				if (hash <= 255 && end - index <= 8) {
					count++;
				} else {
					count = 0;
				}
			} while (count != 4);

			for (@Pc(87) int i = start; i < end; i++) {
				input[i] = '*';
			}

			count = 0;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([CI)I")
	private static int indexOfNumber(@OriginalArg(0) char[] input, @OriginalArg(1) int off) {
		for (@Pc(1) int i = off; i < input.length && i >= 0; i++) {
			if (input[i] >= '0' && input[i] <= '9') {
				return i;
			}
		}

		return -1;
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "([CI)I")
	private static int indexOfNonNumber(@OriginalArg(0) char[] input, @OriginalArg(1) int off) {
		@Pc(1) int i = off;

		while (true) {
			if (i < input.length && i >= 0) {
				if (input[i] >= '0' && input[i] <= '9') {
					i++;
					continue;
				}

				return i;
			}

			return input.length;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "(C)Z")
	private static boolean isSymbol(@OriginalArg(0) char c) {
		return !isAlpha(c) && !isNumber(c);
	}

	@OriginalMember(owner = "mudclient!a/g", name = "c", descriptor = "(C)Z")
	private static boolean isLowerCaseAlpha(@OriginalArg(0) char c) {
		if (c >= 'a' && c <= 'z') {
			return c == 'v' || c == 'x' || c == 'j' || c == 'q' || c == 'z';
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "d", descriptor = "(C)Z")
	private static boolean isAlpha(@OriginalArg(0) char c) {
		return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
	}

	@OriginalMember(owner = "mudclient!a/g", name = "e", descriptor = "(C)Z")
	private static boolean isNumber(@OriginalArg(0) char c) {
		return c >= '0' && c <= '9';
	}

	@OriginalMember(owner = "mudclient!a/g", name = "f", descriptor = "(C)Z")
	private static boolean isLowerCase(@OriginalArg(0) char c) {
		return c >= 'a' && c <= 'z';
	}

	@OriginalMember(owner = "mudclient!a/g", name = "g", descriptor = "(C)Z")
	private static boolean isUpperCase(@OriginalArg(0) char c) {
		return c >= 'A' && c <= 'Z';
	}

	@OriginalMember(owner = "mudclient!a/g", name = "f", descriptor = "([C)Z")
	private static boolean isBadFragment(@OriginalArg(0) char[] input) {
		@Pc(3) boolean skip = true;
		for (@Pc(5) int i = 0; i < input.length; i++) {
			if (!isNumber(input[i]) && input[i] != '\u0000') {
				skip = false;
			}
		}

		if (skip) {
			return true;
		}

		@Pc(30) int hash = word2hash(input);
		@Pc(32) int start = 0;
		@Pc(37) int end = fragments.length - 1;

		if (hash == fragments[start] || hash == fragments[end]) {
			return true;
		}

		do {
			@Pc(55) int middle = (start + end) / 2;
			if (hash == fragments[middle]) {
				return true;
			}

			if (hash < fragments[middle]) {
				end = middle;
			} else {
				start = middle;
			}
		} while (start != end && start + 1 != end);

		return false;
	}

	@OriginalMember(owner = "mudclient!a/g", name = "g", descriptor = "([C)I")
	private static int word2hash(@OriginalArg(0) char[] input) {
		if (input.length > 6) {
			return 0;
		}

		@Pc(9) int value = 0;
		for (@Pc(11) int i = 0; i < input.length; i++) {
			@Pc(22) char c = input[input.length - i - 1];

			if (c >= 'a' && c <= 'z') {
				value = value * 38 + c + 1 - 'a';
			} else if (c == '\'') {
				value = value * 38 + 27;
			} else if (c >= '0' && c <= '9') {
				value = value * 38 + c + 28 - '0';
			} else if (c != '\u0000') {
				if (DEBUG) {
					System.out.println("word2hash failed on " + new String(input));
				}

				return 0;
			}
		}

		return value;
	}
}
