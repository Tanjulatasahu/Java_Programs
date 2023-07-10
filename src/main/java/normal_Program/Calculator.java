package normal_Program;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] str){
        Scanner sc= new Scanner(System.in);
        int operator;
        double num1, num2;
        double result=0;
        System.out.println("1- Add \n 2- Substraction \n 3- Multiplication \n 4- Division");
        System.out.println("Choose the operator: ");
        operator=sc.nextInt();
        System.out.println("Enter first number :");
        num1= sc.nextDouble();
        System.out.println("Enter second number :");
        num2=sc.nextDouble();

        switch(operator){
            case 1: result=num1+num2;
                 System.out.println(result);
                 break;

            case 2: result=num1-num2;
                System.out.println(result);
                break;

            case 3: result=num1*num2;
                System.out.println(result);
                break;

            case 4: result=num1/num2;
                System.out.println(result);
                break;

            default: System.out.println(" Entered operator is wrong.");
        }
    }
}
