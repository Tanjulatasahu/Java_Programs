package pattern_Based_Program;

public class Pattern_5 {
    public static  void main(String[] args){
        /* A
           B B
           C C C
           D D D D
           E E E E E
        */

        for(int i=1,p='A';i<=5;i++,p++){
            for(int j=1;j<=i;j++){
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
    }
}
