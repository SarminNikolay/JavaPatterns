package com.company;
import com.company.abstactfactory.AbstractFactoryApplication;
import com.company.abstactfactory.factory.MacFactory;
import com.company.abstactfactory.factory.WinFactory;
import com.company.abstactfactory.interfaces.GUIFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactoryApplication application;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }
        application = new AbstractFactoryApplication(factory);

        application.onButtonClick();
        application.onCheckBoxChecked();
    }
}
