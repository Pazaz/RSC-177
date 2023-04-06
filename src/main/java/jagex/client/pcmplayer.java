package jagex.client;

import java.io.InputStream;
// import sun.audio.AudioPlayer;

// was: a.a.d
public class pcmplayer extends InputStream {

    public pcmplayer() {
        // AudioPlayer.player.start(this);
    }

    public void method130() {
        // AudioPlayer.player.stop(this);
    }

    public void method131(byte[] abyte0, int i, int j) {
        aByteArray50 = abyte0;
        anInt51 = i;
        anInt52 = i + j;
    }

    public int read(byte[] abyte0, int i, int j) {
        for (int k = 0; k < j; k++)
            if (anInt51 < anInt52)
                abyte0[i + k] = aByteArray50[anInt51++];
            else
                abyte0[i + k] = -1;

        return j;
    }

    public int read() {
        byte[] abyte0 = new byte[1];
        read(abyte0, 0, 1);
        return abyte0[0];
    }

    public byte[] aByteArray50;
    public int anInt51;
    public int anInt52;
}
