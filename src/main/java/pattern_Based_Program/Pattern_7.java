package pattern_Based_Program;

public class Pattern_7 {
    public  static  void main(String[] args){
//           *
//          ***
//         *****
//        *******

        int n=5;
        int c=n*2-1;

//        for(int i=1;i<=n;i++){
//            for(int j=i;j<=n;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<i;j++){
//                System.out.print("* ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
         for(int i=1;i<=n;i++){
             for(int j=1;j<=c;j++){
                 if( j>=n-(i-1)&& j<=n+(i-1)){
                     System.out.print("* ");
                 }
                 else{
                     System.out.print("  ");
                 }
             }
             System.out.println();
         }

    }
}
