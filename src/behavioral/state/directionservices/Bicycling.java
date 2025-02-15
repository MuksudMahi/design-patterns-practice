package behavioral.state.directionservices;

public class Bicycling implements TravelMode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 2;
    }
}
