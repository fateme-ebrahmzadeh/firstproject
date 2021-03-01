package userinterface;

import core.Calculator;

import java.util.Scanner;

public class UserInterface {
    Scanner scan = new Scanner(System.in);
    Calculator calculator;
    public UserInterface(Calculator calculator){
        this.calculator = calculator;
    }
    public void run(){
        System.out.println("hello i'm luna.\n i do sum kind of mathematic task for you \n if you want do Submission write sub and if you want plus write sum and if you want to exit write it.");
        String input = scan.next();
        do{
            if(input.equals("sub")){
                subFunction();
            }else if(input.equals("sum")){
                sumFunction();
            }
        }while(!input.equals("exit"));
    }
    void subFunction(){
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        System.out.println("subtraction of your numbers is:"+calculator.subtractNumbers(firstNumber,secondNumber));
    }
    void sumFunction(){
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        System.out.println("sum of your numbers is :"+calculator.addNumbers(firstNumber,secondNumber));
    }
}
