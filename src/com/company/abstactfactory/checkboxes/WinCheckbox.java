package com.company.abstactfactory.checkboxes;

import com.company.abstactfactory.interfaces.Checkbox;

public class WinCheckbox implements Checkbox {
    @Override
    public void onCheckBoxChecked() {
        System.out.println("Was Checked in Win");
    }
}
