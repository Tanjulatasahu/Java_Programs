package pattern_Based_Program;

public class Pattern_2 {
    public static void main(String args[]){

        /*    *****
              ****
              ***
              **
              *
         */

        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
