package behavioral.strategy.imagestorage;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println("Applying B&W filter");
    }
}
