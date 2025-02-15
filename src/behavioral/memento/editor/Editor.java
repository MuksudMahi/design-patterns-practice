package behavioral.memento.editor;

public class Editor {
    private String content;

    public EditorMemento createState(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento state){
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
