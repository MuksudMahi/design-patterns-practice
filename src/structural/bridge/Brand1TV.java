package structural.bridge;

public class Brand1TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Brand1: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Brand1: turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Brand1: setChannel");
    }
}
