package behavioral.command.fx;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Applying B&W filter");
    }
}
