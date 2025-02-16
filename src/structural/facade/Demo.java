package structural.facade;

public class Demo {
    public static void show() {
        var service = new NotificationService();
        service.send("Hello world", "target");
    }
}
