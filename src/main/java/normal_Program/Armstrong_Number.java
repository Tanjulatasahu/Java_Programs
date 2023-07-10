package normal_Program;

public class Armstrong_Number {
    public static  void main(String[] args){
        int num=651;
        int cube=0;
        int temp=num;

        while(num!=0){
            int r=num%10;
            num=num/10;
            cube=cube+(r*r*r);
        }
        if(temp==cube){
            System.out.println("Number is an armstrong number");
        }else{
            System.out.println("Number is not an armstrong number");
        }

    }
}
