package creational.factory;

import creational.factory.another.AnotherController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends AnotherController {

    public void listProducts() {
        //get products from db
        Map<String, Object> context = new HashMap<>();
        //context.put(products)
        render("products.html", context);
    }
}
