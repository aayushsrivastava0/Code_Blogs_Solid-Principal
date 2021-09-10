package SingleResp;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Add A = new Add();
        Subtract s=new Subtract();
        Multiplication m=new Multiplication();
        Division d = new Division();
        char option;
        int a, b;
        Scanner scannerObject = new Scanner(System.in);
        while(true)
        {

            System.out.println("Please press");
            System.out.println(" '+' : For Addition");
            System.out.println(" '-' : For Subtraction");
            System.out.println(" '*' : For Multiplication");
            System.out.println(" '/' : For Division");
            System.out.println(" '!' : To exit the Calculator");
            System.out.println("Enter the choice");
            option = (scannerObject.next()).charAt(0);
            if(option == '!') {

                System.out.println("Calculator closed");
                return;
            }
            System.out.println("Enter number:");
            a = scannerObject.nextInt();
            System.out.println("Enter second number:");
            b = scannerObject.nextInt();

            switch (option) {
                case '+':
                    System.out.println(" Addition result: " + A.sum(a,b) + "\n\n");
                    break;
                case '-':
                    System.out.println("Subtraction Result: " + s.minus(a,b) + "\n\n");
                    break;
                case '*':
                    System.out.println("Multiplication Result: " + m.mul(a,b) + "\n\n");
                    break;
                case '/':
                    System.out.println("Division Result: " + d.div((double)a, (double)b)+"\n\n");
                    break;
                default:
                    System.out.println("Incorrect Choice!\n\n");
            }
        }
    }
}
