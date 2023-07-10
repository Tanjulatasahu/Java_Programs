package normal_Program;

public class Largest_3_number {
    public static void main(String[] args){
        int num1=40;
        int num2=50;
        int num3=80;

        int largest=num3>(num1>num2?num1:num2)?num3:(num1>num2?num1:num2);
        System.out.print(largest);
    }
}
