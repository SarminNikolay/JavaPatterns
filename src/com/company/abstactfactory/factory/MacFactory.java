package com.company.abstactfactory.factory;

import com.company.abstactfactory.interfaces.Button;
import com.company.abstactfactory.interfaces.Checkbox;
import com.company.abstactfactory.buttons.MacButton;
import com.company.abstactfactory.checkboxes.MacosCheckbox;
import com.company.abstactfactory.interfaces.GUIFactory;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacosCheckbox();
    }


}
