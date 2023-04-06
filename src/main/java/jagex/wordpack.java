package jagex;

// was: a.h
public class wordpack {

    public static String method390(byte[] abyte0, int i, int j) {
        int k = 0;
        int l = -1;
        for (int i1 = 0; i1 < j; i1++) {
            int j1 = abyte0[i++] & 0xff;
            int k1 = j1 >> 4 & 0xf;
            if (l == -1) {
                if (k1 < 13)
                    aCharArray426[k++] = aCharArray427[k1];
                else
                    l = k1;
            } else {
                aCharArray426[k++] = aCharArray427[((l << 4) + k1) - 195];
                l = -1;
            }
            k1 = j1 & 0xf;
            if (l == -1) {
                if (k1 < 13)
                    aCharArray426[k++] = aCharArray427[k1];
                else
                    l = k1;
            } else {
                aCharArray426[k++] = aCharArray427[((l << 4) + k1) - 195];
                l = -1;
            }
        }

        boolean flag = true;
        for (int l1 = 0; l1 < k; l1++) {
            char c = aCharArray426[l1];
            if (l1 > 4 && c == '@')
                aCharArray426[l1] = ' ';
            if (c == '%')
                aCharArray426[l1] = ' ';
            if (flag && c >= 'a' && c <= 'z') {
                aCharArray426[l1] += '\uFFE0';
                flag = false;
            }
            if (c == '.' || c == '!')
                flag = true;
        }

        return new String(aCharArray426, 0, k);
    }

    public static int method391(String s) {
        if (s.length() > 80)
            s = s.substring(0, 80);
        s = s.toLowerCase();
        int i = 0;
        int j = -1;
        for (int k = 0; k < s.length(); k++) {
            char c = s.charAt(k);
            int l = 0;
            for (int i1 = 0; i1 < aCharArray427.length; i1++) {
                if (c != aCharArray427[i1])
                    continue;
                l = i1;
                break;
            }

            if (l > 12)
                l += 195;
            if (j == -1) {
                if (l < 13)
                    j = l;
                else
                    aByteArray425[i++] = (byte) l;
            } else if (l < 13) {
                aByteArray425[i++] = (byte) ((j << 4) + l);
                j = -1;
            } else {
                aByteArray425[i++] = (byte) ((j << 4) + (l >> 4));
                j = l & 0xf;
            }
        }

        if (j != -1)
            aByteArray425[i++] = (byte) (j << 4);
        return i;
    }

    public static byte[] aByteArray425 = new byte[100];
    public static char[] aCharArray426 = new char[100];
    public static char[] aCharArray427 = {
            ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r',
            'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p',
            'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2',
            '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?',
            '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\',
            '\'', '@', '#', '+', '=', '\243', '$', '%', '"', '[',
            ']'
    };

}
