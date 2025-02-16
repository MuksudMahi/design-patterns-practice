package creational.builder;

public class MovieBuilder implements PresentationBuilder {
    private final Movie movie = new Movie();

    @Override
    public void addSlides(Slide slide) {
        movie.addFrame(slide.getText(), 3);
    }

    public Movie getMovie() {
        return movie;
    }
}
