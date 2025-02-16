package structural.adapter;

public class ImageViewer {
    private final Image image;

    public ImageViewer(Image image) {
        this.image = image;
    }

    public void apply(Filter filter) {
        filter.apply(image);
    }
}
