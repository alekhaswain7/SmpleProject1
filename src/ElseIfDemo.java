import java.sql.SQLOutput;

public class ElseIfDemo {

    public static void main(String[] args) {
        String color = "Orange";
        boolean condition = color =="Orange";
        if(condition) {
            System.out.println("Color is Orange");

        }else if(color == "Red"){
            System.out.println("Color is Red");
        } else {
            System.out.println("Other color");
        }
    }
}
