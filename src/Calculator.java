import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0; //variable initialization

        System.out.print("Enter first number: ");
        int numberOne = in.nextInt();

        System.out.print("Enter Operator (+,-,*,/,%) : ");
        String operator = in.next();

        System.out.print("Enter second number: ");
        int numberTwo = in.nextInt();

        if(operator.equals("+")){
            result = numberOne + numberTwo;
        } else if(operator.equals("-")){

            // #NestedIf. If inside an if.
            if (numberOne >= numberTwo) {
                System.out.println("Invoked from Nested if");
                result = numberOne - numberTwo;
            } else {
                System.out.println("Invoked from Nested else");
                result = numberTwo - numberOne;
            }

        } else if(operator.equals("*")) {
            result = numberOne * numberTwo;
        } else if (operator.equals("/")) {
            result = numberOne / numberTwo;
        } else if (operator.equals("%")) {
            result = numberOne % numberTwo;
        } else {
            System.out.print("Invalid operator, Use only (+,-,*,/,%)");
        }

        System.out.println("Result : " + result);


    }
}
