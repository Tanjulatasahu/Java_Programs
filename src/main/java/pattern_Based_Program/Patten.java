package pattern_Based_Program;

public class Patten {
    public static void main(String[] args){

        int n=5;
        int space=(n*2)-2;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            space=space-2;

            System.out.println();
        }




    }


}
