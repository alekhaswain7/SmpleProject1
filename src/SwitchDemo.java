import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0; //variable initialization

        System.out.print("Enter first number: ");
        int numberOne = in.nextInt();

        System.out.print("Enter Operator (+,-,*,/,%) : ");
        String operator = in.next();

        System.out.print("Enter second number: ");
        int numberTwo = in.nextInt();

        switch(operator) {
            case"+":
                System.out.println(numberTwo + numberOne);
                break;
            case"-":
                System.out.println(numberTwo - numberOne);
                break;
            case"*":
                System.out.println(numberTwo * numberOne);
                break;
            case"/":
                System.out.println(numberTwo / numberOne);
                break;
            case"%":
                System.out.println(numberTwo % numberOne);
                break;
            default:
                System.out.print("Invalid operator, Use only (+,-,*,/,%)");
        }

        System.out.println("Exiting");
    }
}
