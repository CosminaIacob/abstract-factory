package design.patterns.factories;

import design.patterns.buttons.Button;
import design.patterns.buttons.WindowsButton;
import design.patterns.checkboxes.Checkbox;
import design.patterns.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
