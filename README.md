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
