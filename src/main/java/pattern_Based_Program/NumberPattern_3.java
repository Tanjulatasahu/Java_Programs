package pattern_Based_Program;
//               1
//               12
//               123
//               1234
//               12345
//
//
//               12345
//               1234
//               123
//               12
//               1
public class NumberPattern_3 {
    public  static  void pattern_1(int n){
        for(int i=1;i<=n;i++){
            int p=1;
            for(int j=1;j<=i;j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
    }
    public  static  void pattern_2(int n){
        for(int i=1;i<=n;i++){
            int p=1;
            for(int j=i;j<=n;j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
    }

    public static  void main(String[] args){
        int n=5;
        System.out.println("Pattern 1");
        pattern_1(n);
        System.out.println();
        System.out.println("Pattern 2");
        pattern_2(n);




    }
}
