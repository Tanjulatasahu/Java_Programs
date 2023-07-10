package normal_Program;

public class Count_digit {
    public static  void main(String[] args){
        int num=1234567;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
