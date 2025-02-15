package behavioral.command.editor;

public class Demo {
    public static void show(){
        var htmlDocument = new HtmlDocument();
        htmlDocument.setContent("Hello World");


        var history = new History();
        var boldCommand = new BoldCommand(history, htmlDocument);

        boldCommand.execute();
        System.out.println(htmlDocument.getContent());

        var undo = new UndoCommand(history);
        undo.execute();
        System.out.println(htmlDocument.getContent());

    }
}
