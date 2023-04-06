import java.applet.Applet;
import java.net.Socket;

// this class was basically unobfuscated already, and method+field names were intact
public class link {

    public static void putjag(String s, byte[] abyte0) {
        name[numfile] = s;
        buf[numfile] = abyte0;
        numfile++;
    }

    public static byte[] getjag(String s) {
        for (int i = 0; i < numfile; i++)
            if (name[i].equals(s))
                return buf[i];

        return null;
    }

    public static Socket opensocket(int i) {
        for (socketport = i; socketport != 0; )
            try {
                Thread.sleep(100L);
            } catch (Exception _ex) {
            }

        return s;
    }

    public static void startthread(Runnable runnable) {
        for (runme = runnable; runme != null; )
            try {
                Thread.sleep(100L);
            } catch (Exception _ex) {
            }

    }

    public static String gethostname(String s) {
        for (iplookup = s; iplookup != null; )
            try {
                Thread.sleep(100L);
            } catch (Exception _ex) {
            }

        return host;
    }

    public link() {
    }

    public static Applet mainapp;
    public static int uid;
    public static int socketport;
    public static Socket s;
    public static Runnable runme = null;
    public static String iplookup = null;
    public static String host;
    public static int numfile;
    public static String[] name = new String[50];
    public static byte[][] buf = new byte[50][];

}
