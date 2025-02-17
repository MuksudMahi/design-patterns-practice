package creational.factory.another;

import creational.factory.custom.ViewEngine;

import java.util.Map;

public class AnotherViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by another custom engine";
    }
}
