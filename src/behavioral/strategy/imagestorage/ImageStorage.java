package behavioral.strategy.imagestorage;

public class ImageStorage {
    public void store(String filename, Compressor compressor, Filter filter){
        compressor.compress(filename);
        filter.apply(filename);
        System.out.println("Storing image");
        System.out.println("Image stored");
    }
}
