## Running the project

```
mvn package
cd target
java -jar mudclient-177.jar members 127.0.0.1 43594
```

The last arguments are optional.  
Switch to or work from the target directory, non-applet clients try to load jag files from ../release

### Starting the original client

Same parameters as above. You can do something like:
```
cd ref
java -cp mudclient177.2003-10-31.jar mudclient members 127.0.0.1 43594
```

Logging in requires a server that correctly:
1) uses the original RSA key (128 bits) for login decoding
2) implements the packet encryption methods for packet handling

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
