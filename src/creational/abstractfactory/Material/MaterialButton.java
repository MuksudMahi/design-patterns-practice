package creational.abstractfactory.Material;

import creational.abstractfactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
