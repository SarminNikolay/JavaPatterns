package com.company.abstactfactory;

import com.company.abstactfactory.interfaces.Button;
import com.company.abstactfactory.interfaces.GUIFactory;
import com.company.abstactfactory.interfaces.Checkbox;

public class AbstractFactoryApplication {
    private Button button;
    private Checkbox checkbox;

    public AbstractFactoryApplication(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void onCheckBoxChecked() {
        checkbox.onCheckBoxChecked();
    }

    public void onButtonClick() {
        button.onButtonClick();
    }
}
