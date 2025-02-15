package behavioral.state.directionservices;

public class Demo {
    public static void show(){
        var directionService = new DirectionService();
        directionService.setTravelMode(new Driving());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());

        directionService.setTravelMode(new Walking());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());
    }
}
