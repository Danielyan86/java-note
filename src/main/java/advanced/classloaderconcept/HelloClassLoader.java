package advanced.classloaderconcept;

import java.util.Base64;

public class HelloClassLoader extends ClassLoader {
    public static void main(String[] args) throws Exception {

        new HelloClassLoader().findClass("HelloData").newInstance();
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String hellobase64 = "yv66vgAAADoAKAoAAgADBwAEDAAFAAYBABBqYXZhL2xhbmcvT2JqZWN0AQAGPGluaXQ+AQADKClWCQAIAAkHAAoMAAsADAEAEGphdmEvbGFuZy9TeXN0ZW0BAANvdXQBABVMamF2YS9pby9QcmludFN0cmVhbTsIAA4BAApIZWxsbyBpdCdzCgAQABEHABIMABMAFAEAE2phdmEvaW8vUHJpbnRTdHJlYW0BAAdwcmludGxuAQAVKExqYXZhL2xhbmcvU3RyaW5nOylWBwAWAQAOamF2YS91dGlsL0RhdGUKABUAAwoAEAAZDAATABoBABUoTGphdmEvbGFuZy9PYmplY3Q7KVYHABwBAAlIZWxsb0RhdGEBAARDb2RlAQAPTGluZU51bWJlclRhYmxlAQASTG9jYWxWYXJpYWJsZVRhYmxlAQAEdGhpcwEAC0xIZWxsb0RhdGE7AQAEbWFpbgEAFihbTGphdmEvbGFuZy9TdHJpbmc7KVYBAARhcmdzAQATW0xqYXZhL2xhbmcvU3RyaW5nOwEAClNvdXJjZUZpbGUBAA5IZWxsb0RhdGEuamF2YQAhABsAAgAAAAAAAgABAAUABgABAB0AAAAvAAEAAQAAAAUqtwABsQAAAAIAHgAAAAYAAQAAAAMAHwAAAAwAAQAAAAUAIAAhAAAACQAiACMAAQAdAAAASAADAAEAAAAWsgAHEg22AA+yAAe7ABVZtwAXtgAYsQAAAAIAHgAAAA4AAwAAAAUACAAGABUABwAfAAAADAABAAAAFgAkACUAAAABACYAAAACACc=";
        byte[] bytes = decode(hellobase64);
        return defineClass(name, bytes, 0, bytes.length);
    }

    private byte[] decode(String base64) {
        return Base64.getDecoder().decode(base64);
    }

}
