package behavioral.chainOfResponsibility;

public class HttpRequest {
    private final String username;
    private final String password;

    public HttpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
