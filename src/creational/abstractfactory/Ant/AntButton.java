package creational.abstractfactory.Ant;

import creational.abstractfactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
