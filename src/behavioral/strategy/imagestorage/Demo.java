package behavioral.strategy.imagestorage;

public class Demo {
    public static void show(){
        var imageStorage = new ImageStorage();
        imageStorage.store("File 1", new jpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("File 1", new pngCompressor(), new HighContrastFilter());
    }
}
