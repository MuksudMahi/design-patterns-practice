package behavioral.command.fx;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resizing");
    }
}
