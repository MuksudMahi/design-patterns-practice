package behavioral.memento.editor;

public class Demo {
    public static void show(){
        var editor = new Editor();
        var history= new History();

        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");

        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
