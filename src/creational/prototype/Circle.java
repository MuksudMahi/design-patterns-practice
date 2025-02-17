package creational.prototype;

public class Circle implements Component {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering circle");
    }

    @Override
    public Component clone() {
        return new Circle(radius);
    }

    public int getRadius() {
        return radius;
    }
}
