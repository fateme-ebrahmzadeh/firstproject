import core.Calculator;
import userinterface.UserInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInterface userInterface = new UserInterface(calculator);
        userInterface.run();
    }
}
