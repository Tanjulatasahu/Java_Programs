package array_Program;

import java.util.Scanner;
// find the square of array element in non-decreasing/increasing order.
// negative element also present in an array.
public class Square_Number {
    public static int[] square(int[] arr){
        int n=arr.length;
        int[] ans =new int[n];
        int k=n-1; // to traverse new ans array from right side and fill  the square of corresponding numbers.
        int i=0; // left pointer
        int j=n-1; // right pointer

        while(i<=j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k] = arr[i] * arr[i];
                k--;
                i++;
            } else {
                ans[k] = arr[j] * arr[j];
                k--;
                j--;
            }
        }

        return ans;

////        for(int i=0;i<n;i++){
//            arr[i]=arr[i]*arr[i];
//        }


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter" + " " + n + " " + "elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=square(arr);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
