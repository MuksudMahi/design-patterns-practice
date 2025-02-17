package creational.builder;

public class Demo {
    public static void show() {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide1"));
        presentation.addSlide(new Slide("Slide2"));

        var builder = new PdfDocumentBuilder();
        presentation.export(builder);
        var pdf = builder.getPdfDocument();
    }
}
