package structural.decorator;

public class Demo {
    public static void show() {
        storeInfo(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    private static void storeInfo(Stream stream) {
        stream.write("123-123-123-123");
    }
}
