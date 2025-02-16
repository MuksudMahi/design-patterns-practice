package structural.proxy;

public class Demo {
    public static void show() {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames)
            library.add(new EbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");
    }
}
