package structural.adapter;

import structural.adapter.filterlibrary.Caramel;

public class Demo {
    public static void show() {
        var imageViewer = new ImageViewer(new Image());
        imageViewer.apply(new CaramelAdapter(new Caramel()));

        imageViewer.apply(new CaramelAdapterInheritance());
    }
}
