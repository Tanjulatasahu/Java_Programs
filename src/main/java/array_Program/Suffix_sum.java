package array_Program;

import java.util.Scanner;

public class Suffix_sum {
    public static int[] suffixSum(int[] arr){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];
        }
        return arr;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter" + " " + n + " " + "elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] suffix=suffixSum(arr);
        for(int i=0;i<suffix.length;i++){
            System.out.print(suffix[i]+" ");
        }
    }
}
