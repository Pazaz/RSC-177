package jagex.client;

import jagex.tools;
import jagex.wordfilter4;
import jagex.wordpack;

import java.awt.*;
import java.io.IOException;
import java.math.BigInteger;

// was: a.a.b
public class client extends gameshell {

    public void method21(BigInteger biginteger, BigInteger biginteger1) {
        aBigInteger627 = biginteger;
        aBigInteger628 = biginteger1;
    }

    public int getUid() {
        return 0;
    }

    public void login(String user, String pass, boolean reconnecting) {
        if (worldFullTimeout > 0) {
            showLoginScreenStatus(loginResponses[6], loginResponses[7]);
            try {
                Thread.sleep(2000L);
            } catch (Exception _ex) {
            }
            showLoginScreenStatus(loginResponses[8], loginResponses[9]);
            return;
        }
        try {
            username = user;
            user = tools.formatAuthString(user, 20);
            password = pass;
            pass = tools.formatAuthString(pass, 20);
            if (user.trim().length() == 0) {
                showLoginScreenStatus(loginResponses[0], loginResponses[1]);
                return;
            }
            if (reconnecting)
                drawTextBox(loginResponses[2], loginResponses[3]);
            else
                showLoginScreenStatus(loginResponses[6], loginResponses[7]);
            connection = new clientstream(openSocket(host, port), this);
            connection.maxReadTries = maxReadTries;
            int sessionId = connection.g4();
            this.sessionId = sessionId;
            System.out.println("Session id: " + sessionId);
            int params = 0;
            try {
                if (getIsApplet()) {
                    String s2 = getParameter("referid");
                    params = Integer.parseInt(s2);
                    String s3 = getParameter("limit30");
                    if (s3.equals("1"))
                        params += 50;
                }
            } catch (Exception _ex) {
            }
            if (reconnecting)
                connection.p1opcode(19, 712);
            else
                connection.p1opcode(0, 625);
            connection.p2(revision);
            connection.p2(params);
            connection.p8(tools.toBase37(user));
            connection.rsaenc(pass, sessionId, aBigInteger627, aBigInteger628);
            connection.p4(getUid());
            connection.flush();
            connection.g1();
            int loginResponse = connection.g1();
            loginResponse = connection.method335(loginResponse, opcodeEncryptionArray);
            System.out.println("Login response: " + loginResponse);
            if (loginResponse == 0) {
                anInt616 = 0;
                method42();
                return;
            }
            if (loginResponse == 1) {
                anInt616 = 0;
                method41();
                return;
            }
            if (reconnecting) {
                user = "";
                pass = "";
                method43();
                return;
            }
            if (loginResponse == 3) {
                showLoginScreenStatus(loginResponses[10], loginResponses[11]);
                return;
            }
            if (loginResponse == 4) {
                showLoginScreenStatus(loginResponses[4], loginResponses[5]);
                return;
            }
            if (loginResponse == 5) {
                showLoginScreenStatus(loginResponses[16], loginResponses[17]);
                return;
            }
            if (loginResponse == 6) {
                showLoginScreenStatus(loginResponses[18], loginResponses[19]);
                return;
            }
            if (loginResponse == 7) {
                showLoginScreenStatus(loginResponses[20], loginResponses[21]);
                return;
            }
            if (loginResponse == 11) {
                showLoginScreenStatus(loginResponses[22], loginResponses[23]);
                return;
            }
            if (loginResponse == 12) {
                showLoginScreenStatus(loginResponses[24], loginResponses[25]);
                return;
            }
            if (loginResponse == 13) {
                showLoginScreenStatus(loginResponses[14], loginResponses[15]);
                return;
            }
            if (loginResponse == 14) {
                showLoginScreenStatus(loginResponses[8], loginResponses[9]);
                worldFullTimeout = 1500;
                return;
            }
            if (loginResponse == 15) {
                showLoginScreenStatus(loginResponses[26], loginResponses[27]);
                return;
            }
            if (loginResponse == 16) {
                showLoginScreenStatus(loginResponses[28], loginResponses[29]);
                return;
            } else {
                showLoginScreenStatus(loginResponses[12], loginResponses[13]);
                return;
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
        if (anInt616 > 0) {
            try {
                Thread.sleep(5000L);
            } catch (Exception _ex) {
            }
            anInt616--;
            login(username, password, reconnecting);
        }
        if (reconnecting) {
            username = "";
            password = "";
            method43();
        } else {
            showLoginScreenStatus(loginResponses[12], loginResponses[13]);
        }
    }

    public void method24() {
        if (connection != null)
            try {
                connection.p1opcode(1, 325);
                connection.flush();
            } catch (IOException _ex) {
            }
        username = "";
        password = "";
        method43();
    }

    public void method25() {
        System.out.println("Lost connection");
        anInt616 = 10;
        login(username, password, true);
    }

    public void drawTextBox(String s, String s1) {
        Graphics g = getGraphics();
        Font font = new Font("Helvetica", 1, 15);
        char c = '\u0200';
        char c1 = '\u0158';
        g.setColor(Color.black);
        g.fillRect(c / 2 - 140, c1 / 2 - 25, 280, 50);
        g.setColor(Color.white);
        g.drawRect(c / 2 - 140, c1 / 2 - 25, 280, 50);
        method16(g, s, font, c / 2, c1 / 2 - 10);
        method16(g, s1, font, c / 2, c1 / 2 + 10);
    }

    public void method27(String s, String s1) {
        if (worldFullTimeout > 0) {
            showLoginScreenStatus(loginResponses[6], loginResponses[7]);
            try {
                Thread.sleep(2000L);
            } catch (Exception _ex) {
            }
            showLoginScreenStatus(loginResponses[8], loginResponses[9]);
            return;
        }
        try {
            s = tools.formatAuthString(s, 20);
            s1 = tools.formatAuthString(s1, 20);
            showLoginScreenStatus(loginResponses[6], loginResponses[7]);
            connection = new clientstream(openSocket(host, port), this);
            int i = connection.g4();
            sessionId = i;
            System.out.println("Session id: " + i);
            int j = 0;
            try {
                if (getIsApplet()) {
                    String s2 = getParameter("referid");
                    j = Integer.parseInt(s2);
                    String s3 = getParameter("limit30");
                    if (s3.equals("1"))
                        j += 50;
                }
            } catch (Exception _ex) {
            }
            connection.p1opcode(2, 129);
            connection.p2(revision);
            connection.p8(tools.toBase37(s));
            connection.p2(j);
            connection.rsaenc(s1, i, aBigInteger627, aBigInteger628);
            connection.p4(getUid());
            connection.flush();
            connection.g1();
            int k = connection.g1();
            connection.close();
            k = connection.method335(k, opcodeEncryptionArray);
            System.out.println("Newplayer response: " + k);
            if (k == 2) {
                newPlayerRegistrationLogin();
                return;
            }
            if (k == 3) {
                showLoginScreenStatus(loginResponses[14], loginResponses[15]);
                return;
            }
            if (k == 4) {
                showLoginScreenStatus(loginResponses[4], loginResponses[5]);
                return;
            }
            if (k == 5) {
                showLoginScreenStatus(loginResponses[16], loginResponses[17]);
                return;
            }
            if (k == 6) {
                showLoginScreenStatus(loginResponses[18], loginResponses[19]);
                return;
            }
            if (k == 7) {
                showLoginScreenStatus(loginResponses[20], loginResponses[21]);
                return;
            }
            if (k == 11) {
                showLoginScreenStatus(loginResponses[22], loginResponses[23]);
                return;
            }
            if (k == 12) {
                showLoginScreenStatus(loginResponses[24], loginResponses[25]);
                return;
            }
            if (k == 13) {
                showLoginScreenStatus(loginResponses[14], loginResponses[15]);
                return;
            }
            if (k == 14) {
                showLoginScreenStatus(loginResponses[8], loginResponses[9]);
                worldFullTimeout = 1500;
                return;
            }
            if (k == 15) {
                showLoginScreenStatus(loginResponses[26], loginResponses[27]);
                return;
            }
            if (k == 16) {
                showLoginScreenStatus(loginResponses[28], loginResponses[29]);
                return;
            } else {
                showLoginScreenStatus(loginResponses[12], loginResponses[13]);
                return;
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
        showLoginScreenStatus(loginResponses[12], loginResponses[13]);
    }

    public void checkConnection() {
        long l = System.currentTimeMillis();
        if (connection.method339())
            aLong617 = l;
        if (l - aLong617 > 5000L) {
            aLong617 = l;
            connection.p1opcode(5, 348);
            connection.sendPacket();
        }
        try {
            connection.writePacket(20);
        } catch (IOException _ex) {
            method25();
            return;
        }
        if (!method48())
            return;
        int i = connection.method326(in);
        if (i > 0)
            method29(in[0] & 0xff, i);
    }

    public void method29(int i, int j) {
        i = connection.method335(i, opcodeEncryptionArray);
        if (i == 8) {
            String s = new String(in, 1, j - 1);
            displayMessage(s);
        }
        if (i == 9)
            method24();
        if (i == 10) {
            method44();
            return;
        }
        if (i == 23) {
            anInt618 = tools.g1(in[1]);
            for (int k = 0; k < anInt618; k++) {
                friendName37[k] = tools.g8(in, 2 + k * 9);
                friendWorlds[k] = tools.g1(in[10 + k * 9]);
            }

            method30();
            return;
        }
        if (i == 24) {
            long l = tools.g8(in, 1);
            int j1 = in[9] & 0xff;
            for (int k1 = 0; k1 < anInt618; k1++)
                if (friendName37[k1] == l) {
                    if (friendWorlds[k1] == 0 && j1 != 0)
                        displayMessage("@pri@" + tools.fromBase37(l) + " has logged in");
                    if (friendWorlds[k1] != 0 && j1 == 0)
                        displayMessage("@pri@" + tools.fromBase37(l) + " has logged out");
                    friendWorlds[k1] = j1;
                    j = 0;
                    method30();
                    return;
                }

            friendName37[anInt618] = l;
            friendWorlds[anInt618] = j1;
            anInt618++;
            displayMessage("@pri@" + tools.fromBase37(l) + " has been added to your friends list");
            method30();
            return;
        }
        if (i == 26) {
            anInt621 = tools.g1(in[1]);
            for (int i1 = 0; i1 < anInt621; i1++)
                ignoreName37[i1] = tools.g8(in, 2 + i1 * 8);

            return;
        }
        if (i == 27) {
            anInt623 = in[1];
            anInt624 = in[2];
            anInt625 = in[3];
            anInt626 = in[4];
            return;
        }
        if (i == 28) {
            long l1 = tools.g8(in, 1);
            String s1 = wordfilter4.method365(wordpack.method390(in, 9, j - 9));
            displayMessage("@pri@" + tools.fromBase37(l1) + ": tells you " + s1);
        } else {
            method46(i, j, in);
        }
    }

    public void method30() {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < anInt618 - 1; i++)
                if (friendWorlds[i] < friendWorlds[i + 1]) {
                    int j = friendWorlds[i];
                    friendWorlds[i] = friendWorlds[i + 1];
                    friendWorlds[i + 1] = j;
                    long l = friendName37[i];
                    friendName37[i] = friendName37[i + 1];
                    friendName37[i + 1] = l;
                    flag = true;
                }

        }
    }

    public void changePassword(String s, String s1) {
        s = tools.formatAuthString(s, 20);
        s1 = tools.formatAuthString(s1, 20);
        connection.p1opcode(25, 551);
        connection.rsaenc(s + s1, sessionId, aBigInteger627, aBigInteger628);
        connection.sendPacket();
    }

    public void sendPrivacySettings(int i, int j, int k, int l) {
        connection.p1opcode(31, 777);
        connection.p1(i);
        connection.p1(j);
        connection.p1(k);
        connection.p1(l);
        connection.sendPacket();
    }

    public void ignoreAdd(String s) {
        long l = tools.toBase37(s);
        connection.p1opcode(29, 101);
        connection.p8(l);
        connection.sendPacket();
        for (int i = 0; i < anInt621; i++)
            if (ignoreName37[i] == l)
                return;

        if (anInt621 >= 50) {
        } else {
            ignoreName37[anInt621++] = l;
        }
    }

    public void ignoreRemove(long l) {
        connection.p1opcode(30, 511);
        connection.p8(l);
        connection.sendPacket();
        for (int i = 0; i < anInt621; i++)
            if (ignoreName37[i] == l) {
                anInt621--;
                for (int j = i; j < anInt621; j++)
                    ignoreName37[j] = ignoreName37[j + 1];

                return;
            }

    }

    public void friendAdd(String s) {
        connection.p1opcode(26, 622);
        connection.p8(tools.toBase37(s));
        connection.sendPacket();
    }

    public void friendRemove(long l) {
        connection.p1opcode(27, 707);
        connection.p8(l);
        connection.sendPacket();
        for (int i = 0; i < anInt618; i++) {
            if (friendName37[i] != l)
                continue;
            anInt618--;
            for (int j = i; j < anInt618; j++) {
                friendName37[j] = friendName37[j + 1];
                friendWorlds[j] = friendWorlds[j + 1];
            }

            break;
        }

        displayMessage("@pri@" + tools.fromBase37(l) + " has been removed from your friends list");
    }

    public void sendPrivateChat(long l, byte[] abyte0, int i) {
        connection.p1opcode(28, 185);
        connection.p8(l);
        connection.pdata(abyte0, 0, i);
        connection.sendPacket();
    }

    public void sendChat(byte[] abyte0, int i) {
        connection.p1opcode(3, 643);
        connection.pdata(abyte0, 0, i);
        connection.sendPacket();
    }

    public void sendCommandString(String s) {
        connection.p1opcode(7, 293);
        connection.pstr(s);
        connection.sendPacket();
    }

    public void showLoginScreenStatus(String s, String s1) {
    }

    public void method41() {
    }

    public void method42() {
    }

    public void method43() {
    }

    public void method44() {
    }

    public void newPlayerRegistrationLogin() {
    }

    public void method46(int i, int j, byte[] abyte0) {
    }

    public void displayMessage(String s) {
    }

    public boolean method48() {
        return true;
    }

    public client() {
        host = "127.0.0.1";
        port = 43594;
        username = "";
        password = "";
        in = new byte[5000];
        friendName37 = new long[100];
        friendWorlds = new int[100];
        ignoreName37 = new long[50];
    }

    public static String[] loginResponses;
    public static int revision = 1;
    public static int maxReadTries;
    public String host;
    public int port;
    public String username;
    public String password;
    public clientstream connection;
    public byte[] in;
    public int anInt616;
    public long aLong617;
    public int anInt618;
    public long[] friendName37;
    public int[] friendWorlds;
    public int anInt621;
    public long[] ignoreName37;
    public int anInt623;
    public int anInt624;
    public int anInt625;
    public int anInt626;
    public BigInteger aBigInteger627;
    public BigInteger aBigInteger628;
    public int sessionId;
    public int worldFullTimeout;
    public static final int[] opcodeEncryptionArray = {
            124, 345, 953, 124, 634, 636, 661, 127, 177, 295,
            559, 384, 321, 679, 871, 592, 679, 347, 926, 585,
            681, 195, 785, 679, 818, 115, 226, 799, 925, 852,
            194, 966, 32, 3, 4, 5, 6, 7, 8, 9,
            40, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            50, 444, 52, 3, 4, 5, 6, 7, 8, 9,
            60, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            70, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            80, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            90, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            100, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            110, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            120, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            130, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            140, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            150, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            160, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            170, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            180, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            694, 235, 846, 834, 300, 200, 298, 278, 247, 286,
            346, 144, 23, 913, 812, 765, 432, 176, 935, 452,
            542, 45, 346, 65, 637, 62, 354, 123, 34, 912,
            812, 834, 698, 324, 872, 912, 438, 765, 344, 731,
            625, 783, 176, 658, 128, 854, 489, 85, 6, 865,
            43, 573, 132, 527, 235, 434, 658, 912, 825, 298,
            753, 282, 652, 439, 629, 945
    };

    static {
        loginResponses = new String[50];
        loginResponses[0] = "You must enter both a username";
        loginResponses[1] = "and a password - Please try again";
        loginResponses[2] = "Connection lost! Please wait...";
        loginResponses[3] = "Attempting to re-establish";
        loginResponses[4] = "That username is already in use.";
        loginResponses[5] = "Wait 60 seconds then retry";
        loginResponses[6] = "Please wait...";
        loginResponses[7] = "Connecting to server";
        loginResponses[8] = "Sorry! The server is currently full.";
        loginResponses[9] = "Please try again later";
        loginResponses[10] = "Invalid username or password.";
        loginResponses[11] = "Try again, or create a new account";
        loginResponses[12] = "Sorry! Unable to connect to server.";
        loginResponses[13] = "Check your internet settings";
        loginResponses[14] = "Username already taken.";
        loginResponses[15] = "Please choose another username";
        loginResponses[16] = "The client has been updated.";
        loginResponses[17] = "Please reload this page";
        loginResponses[18] = "You may only use 1 character at once.";
        loginResponses[19] = "Your ip-address is already in use";
        loginResponses[20] = "Login attempts exceeded!";
        loginResponses[21] = "Please try again in 5 minutes";
        loginResponses[22] = "Account has been temporarily disabled";
        loginResponses[23] = "check your message inbox for details";
        loginResponses[24] = "Account has been permanently disabled";
        loginResponses[25] = "check your message inbox for details";
        loginResponses[26] = "You need a members account";
        loginResponses[27] = "to login to this server";
        loginResponses[28] = "Please login to a members server";
        loginResponses[29] = "to access member-only features";
    }
}
