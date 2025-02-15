package behavioral.command.fx;

public class Button {
    private String label;
    private Command command;


    public String getLabel() {
        return label;
    }

    public void click(){
        command.execute();
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Button(Command command) {
        this.command = command;
    }

}
