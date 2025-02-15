package behavioral.iterator.productcollection;


public class Demo {
    public static void show() {
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "Product 1"));
        productCollection.add(new Product(2, "Product 2"));
        productCollection.add(new Product(3, "Product 3"));
        productCollection.add(new Product(4, "Product 4"));

        var iterator = productCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
