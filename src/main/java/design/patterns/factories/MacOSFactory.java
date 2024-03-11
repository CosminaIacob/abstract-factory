package design.patterns.factories;

import design.patterns.buttons.Button;
import design.patterns.buttons.MacOSButton;
import design.patterns.checkboxes.Checkbox;
import design.patterns.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
