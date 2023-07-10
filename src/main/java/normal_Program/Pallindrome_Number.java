package normal_Program;

public class Pallindrome_Number {
    public static  void main(String[] args){
        int num=12345;
        int rev=0;
        int temp=num;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==temp){
            System.out.println("Pallindrome number");
        }else{
            System.out.println("Not a Pallindrome number");
        }

    }
}
