package behavioral.memento.document;

public class Demo {
    public static void show() {
        var document = new Document();
        var careTaker = new DocumentCaretaker();

        document.setContent("Hello");
        careTaker.add(document.createMemento());

        document.setFontName("Font 1");
        careTaker.add(document.createMemento());

        document.setFontSize(10);
        careTaker.add(document.createMemento());
        System.out.println(document);

        document.setFontSize(12);
        System.out.println(document);

        document.restore(careTaker.get());
        System.out.println(document);

        document.restore(careTaker.get());
        System.out.println(document);
    }
}
