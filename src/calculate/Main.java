package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = (int) scanner.nextDouble();
        System.out.print("Enter second number: ");
        int b = (int) scanner.nextDouble();
        System.out.print("Please enter one of symbol +,-,*,/ : ");
        char symbol = scanner.next().charAt(0);

        Calculator obj = new Calculator();
        obj.calculateResult(a,b,symbol);


    }
}
