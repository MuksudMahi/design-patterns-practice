package behavioral.strategy.imagestorage;

public class pngCompressor implements Compressor{
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using PNG");
    }
}
