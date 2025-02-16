package structural.bridge;

public class Demo {
    public static void show() {
        var remoteControl = new RemoteControl(new Brand1TV());
        remoteControl.turnOn();
    }
}
