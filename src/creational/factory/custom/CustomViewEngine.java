package creational.factory.custom;

import java.util.Map;

public class CustomViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by custom engine";
    }
}
