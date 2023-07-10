package pattern_Based_Program;
//          1
//          22
//          111
//          2222
//          11111
public class NumberPattern_2 {
    public static  void pattern_1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(2+" ");
                }
            }
            System.out.println();
        }
    }

    public static  void main(String[] args){
        int n=5;
        System.out.println("Pattern 1");
        pattern_1(n);
//        System.out.println();
//        //System.out.println("Pattern 2");
//        //pattern_2(n);




    }
}
