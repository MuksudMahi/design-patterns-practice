package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtlmDocument {
    private List<HtmlNode>nodes=new ArrayList<>();

    public void add(HtmlNode node){
        nodes.add(node);
    }

    public void execute(Operation operation){
        nodes.forEach(htmlNode -> htmlNode.execute(operation));
    }
}
