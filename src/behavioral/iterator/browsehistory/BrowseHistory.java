package behavioral.iterator.browsehistory;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        return urls.removeLast();
    }

    public class ListIterator implements Iterator {
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}
