package structural.flyweight;

public class Demo {
    public static void show() {
        var service = new PointService(new PointIconFactory());
        service.getPoint().forEach(Point::draw);
    }
}
