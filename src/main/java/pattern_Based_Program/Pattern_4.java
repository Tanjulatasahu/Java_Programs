package pattern_Based_Program;

public class Pattern_4 {
    public static  void main(String[] args){
        /* A
           A B
           A B C
           A B C D
           A B C D E
        */

        for(int i=1;i<=5;i++){
            int p='A';
            for(int j=1;j<=i;j++){
                System.out.print((char)p++ +" ");
            }
            System.out.println();
        }
    }
}
