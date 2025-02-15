package behavioral.mediator.regular;

public class ArticlesDialogBox extends DialogBox {
    private ListBox artticlesListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        artticlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println(saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl control) {
        if (control == artticlesListBox)
            articleSelected();
        else if (control == titleTextBox)
            titleChanged();
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
