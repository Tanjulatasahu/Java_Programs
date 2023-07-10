package array_Program;

import java.util.Scanner;
// sort even and odd number in an array.
public class Even_Odd_Array {

    static int[] evenOdd(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 == 1) {
                j--;
            }

        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter" + " " + n + " " + "elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        int [] ans=evenOdd(arr);

        for(int i=0; i<arr.length;i++){
            System.out.print(ans[i]+ " ");
        }



    }

}
