package normal_Program;

public class Largest_digit {
    public static  void main(String[] args){
        int num=651;
        int max=0;
        while(num!=0){
           int r=num%10;
           if(max<r){
               max=r;
           }
            num=num/10;
        }
        System.out.println(max);
    }
}
