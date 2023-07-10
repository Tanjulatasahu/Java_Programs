package pattern_Based_Program;

public class NumberPattern_1 {
//                  0
//                  22
//                  444
//                  6666
//                  88888


//                  88888
//                   6666
//                    444
//                     22
//                      0

//

    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(i*2+" ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print((n-(i+1))*2+" ");
            }
            System.out.println();
        }
    }
    public static  void main(String[] args){
        int n=5;
        System.out.println("Pattern 1");
        pattern1(n);
        System.out.println();
        System.out.println("Pattern 2");
        pattern2(n);




    }
}
