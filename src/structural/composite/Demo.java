package structural.composite;

public class Demo {
    public static void show() {
        var group1 = new Group();
        group1.addComponents(new Shape());
        group1.addComponents(new Shape());

        var group2 = new Group();
        group2.addComponents(new Shape());
        group2.addComponents(new Shape());

        var group = new Group();
        group.addComponents(group1);
        group.addComponents(group2);

        group.render();
    }
}
