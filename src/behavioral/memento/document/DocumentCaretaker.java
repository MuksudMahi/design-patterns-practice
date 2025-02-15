package behavioral.memento.document;

import java.util.ArrayDeque;
import java.util.Deque;

public class DocumentCaretaker {
    Deque<DocumentMemento> deque = new ArrayDeque<>();

    public void add(DocumentMemento documentMemento) {
        deque.push(documentMemento);
    }

    public DocumentMemento get() {
        return deque.pop();
    }
}
