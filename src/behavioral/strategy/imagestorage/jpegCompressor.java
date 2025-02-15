package behavioral.strategy.imagestorage;

public class jpegCompressor implements Compressor {
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using JPEG");
    }
}
