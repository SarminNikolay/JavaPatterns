package com.company.abstactfactory.buttons;

import com.company.abstactfactory.interfaces.Button;

public class WinButton implements Button {

    @Override
    public void onButtonClick() {
        System.out.println("Was Click in Win OS");

    }
}
