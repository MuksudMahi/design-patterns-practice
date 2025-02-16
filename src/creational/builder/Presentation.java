package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private final List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationBuilder builder) {
        for (Slide slide : slides) {
            builder.addSlides(slide);
        }
    }
}
