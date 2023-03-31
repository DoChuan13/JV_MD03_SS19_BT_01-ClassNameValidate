package app.view;

import app.config.ClassValidate;
import app.config.InputConfig;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input Class Name: ");
        String className = InputConfig.getString();
        boolean checkValidate = ClassValidate.validateClassName(className);
        System.out.println("Class name " + className + " is " + (checkValidate ? "Valid" : "INVALID"));
    }
}
