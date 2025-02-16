package structural.adapter;

import structural.adapter.filterlibrary.Caramel;

public class CaramelAdapter implements Filter {
    private final Caramel caramel;

    public CaramelAdapter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
