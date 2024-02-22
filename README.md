## Running the client

It's real simple -- I use gradle and included a wrapper for you.

```
./gradlew run
```

Logging in requires a server that correctly:
1) uses the original RSA key (128 bits) for login decoding
2) implements the packet encryption methods for packet handling

You can see my reference server implementation [here](https://github.com/Pazaz/RSC-177-Server).

### Application Arguments

The first argument is whether the world is a members world or not. You pass "members" to this argument. Any other value is considered a free world.  
The second argument is the world's host address.  
The third argument is the world's port.

If you leave out any arguments, the default behavior defines a "free" world at `127.0.0.1:43594`.

You can pass arguments to the gradle wrapper by using the `--args` flag.

```
./gradlew run --args="members 127.0.0.1 43594"
```

### Applet Parameters

These differ from the application arguments slightly.

|name|description|
|-|-|
|member|Members world|
|poff|Port offset + 43594|
|referid||
|limit30||

### Starting the original client

```
java -cp mudclient177.jar mudclient
```

In application mode (versus applet) there are some caveats to be aware of.  
**IMPORTANT**: The original client tries to load .ob2 models from `../gamedata`. You won't see locs because of this.  
**IMPORTANT**: The original client tries to load .jag files from `../release`. You will need to run this from a suitable directory.

## RSA key

This revision used a 128-bit RSA key during login.  
I've factorized it with yafu and placed it under the ref/ folder in a PEM format.

The raw data is:  
```
n = 192956484481579778191558061814292671521 (modulus)
e = 18439792161837834709 (public)
d = 80671108003703759362513259812649815933 (private)
```

And for posterity, the CRT parameters:
```
q = 11821125398780902433
dP = 3671620338775486333
dQ = 2467996465760991997
qInv = 9913549803553164424
```

## Class Names

For a few revisions (174-177?), source file annotations can be found hidden inside the original class files.  
I've taken those annotations and applied them here (with tweaks for readability) - for posterity they are listed below.

|Class|Source File|
|-|-|
|link.class|link.java|
|mudclient.class|mudclient.java|
|b.class|clientconfig.java|
|c.class|entity.java|
|d.class|mudpix.java|
|e.class|version.java|
|f.class|world.java|
|a/b.class|bzip2.java|
|a/c.class|bzip2.java|
|a/d.class|r1packet.java|
|a/e.class|stream.java|
|a/f.class|tools.java|
|a/g.class|wordfilter4.java|
|a/h.class|wordpack.java|
|a/a/a.class|gameshell.java|
|a/a/b.class|client.java|
|a/a/c.class|viewbox.java|
|a/a/d.class|pcmplayer.java|
|a/a/e.class|gui.java|
|a/a/f.class|object3d.java|
|a/a/g.class|pixmap.java|
|a/a/h.class|polygon3d.java|
|a/a/i.class|scanline.java|
|a/a/j.class|world3d.java|
|a/a/k.class|clientstream.java|
