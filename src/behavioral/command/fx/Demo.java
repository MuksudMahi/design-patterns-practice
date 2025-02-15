package behavioral.command.fx;

public class Demo {
    public static void show(){
        var compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BlackAndWhiteCommand());

        compositeCommand.execute();
    }
}
