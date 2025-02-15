package behavioral.mediator.observer;

public class ArticlesDialogBox {
    private ListBox artticlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        artticlesListBox.attach(this::articleSelected);
        titleTextBox.attach(this::titleChanged);
    }

    public void simulateUserInteraction() {
        artticlesListBox.setSelection("Article 1");
        //titleTextBox.setContent("");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println(saveButton.isEnabled());
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        titleTextBox.setContent(artticlesListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
