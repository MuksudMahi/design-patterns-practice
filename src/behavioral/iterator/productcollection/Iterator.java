package behavioral.iterator.productcollection;

public interface Iterator<E> {
    boolean hasNext();

    E current();

    void next();
}
