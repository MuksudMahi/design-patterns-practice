package creational.abstractfactory;

import creational.abstractfactory.Ant.AntWidgetFactory;
import creational.abstractfactory.app.ContactForm;

public class Demo {
    public static void show() {
        var form = new ContactForm();
        form.render(new AntWidgetFactory());
    }
}
