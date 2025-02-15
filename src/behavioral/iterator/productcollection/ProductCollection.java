package behavioral.iterator.productcollection;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public void add(Product product) {
        products.add(product);
    }

    public class ListIterator implements Iterator {

        private ProductCollection productCollection;
        private int index;

        public ListIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public boolean hasNext() {
            return index < productCollection.products.size();
        }

        @Override
        public Object current() {
            return productCollection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }


}
