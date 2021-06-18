package com.company.abstactfactory.factory;

import com.company.abstactfactory.interfaces.Button;
import com.company.abstactfactory.interfaces.Checkbox;
import com.company.abstactfactory.buttons.WinButton;
import com.company.abstactfactory.checkboxes.WinCheckbox;
import com.company.abstactfactory.interfaces.GUIFactory;

public class WinFactory implements GUIFactory {


    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
