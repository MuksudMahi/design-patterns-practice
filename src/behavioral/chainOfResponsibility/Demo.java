package behavioral.chainOfResponsibility;

public class Demo {
    public static void show() {
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
    }
}
