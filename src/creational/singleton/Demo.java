package creational.singleton;

public class Demo {
    public static void show() {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("Name", "John");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("Name"));
    }
}
