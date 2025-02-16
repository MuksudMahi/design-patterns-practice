package structural.adapter;

import structural.adapter.filterlibrary.Caramel;

public class CaramelAdapterInheritance extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
