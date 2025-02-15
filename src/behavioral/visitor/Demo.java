package behavioral.visitor;

public class Demo {
    public static void show(){
        var document = new HtlmDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
    }
}
