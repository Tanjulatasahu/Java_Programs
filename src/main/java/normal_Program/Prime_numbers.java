package normal_Program;

public class Prime_numbers {
    public static void main(String[] args){
        System.out.println(isPrimeNumber(7));

        int count1=getPrimeNumber(40);
        System.out.println(count1);
    }

    public static Boolean isPrimeNumber(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<n;i++){
            if(n%i==0){
                return  false;
            }
        }
        return true;
    }

    public static  int getPrimeNumber(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrimeNumber(i)){
                count++;
                System.out.print(i+" ");

            }
        }
        System.out.println();
        return count;
    }
}
