package creational.factory.another;

import creational.factory.custom.Controller;
import creational.factory.custom.ViewEngine;

public class AnotherController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new AnotherViewEngine();
    }
}
