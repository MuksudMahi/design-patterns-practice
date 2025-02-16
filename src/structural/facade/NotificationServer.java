package structural.facade;

public class NotificationServer {
    public Connection connect(String ip) {
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending a message");
    }
}
