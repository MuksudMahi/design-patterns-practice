package creational.abstractfactory.Ant;

import creational.abstractfactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
