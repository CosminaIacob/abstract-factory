package design.patterns.factories;

import design.patterns.buttons.Button;
import design.patterns.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
