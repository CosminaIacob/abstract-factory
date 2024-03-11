package design.patterns.app;

import design.patterns.buttons.Button;
import design.patterns.checkboxes.Checkbox;
import design.patterns.factories.GUIFactory;

public class Application {

    private Button button;

    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
