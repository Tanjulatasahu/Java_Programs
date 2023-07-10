package array_Program;

import java.util.Scanner;

public class Prefix_sum {
    public static int[] prefixSum(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
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
        int[] prefix=prefixSum(arr);
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
