package behavioral.memento.editor;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<EditorMemento>states=new ArrayList<>();

    public void push(EditorMemento state){
        states.add(state);
    }

    public EditorMemento pop(){
        return states.removeLast();
    }
}
