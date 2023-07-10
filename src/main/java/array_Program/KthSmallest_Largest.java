package array_Program;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest_Largest {

    public static int[] KthsmallestAndLargeest(int[] arr,int k){
        Arrays.sort(arr);
        int ans[]={arr[k-1],arr[arr.length-k]};
        return ans;
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
        System.out.print("Enter k :");
        int k=sc.nextInt();
        int[] ans=KthsmallestAndLargeest(arr,k);

        System.out.println(k +" " + "smallest and largest element is : ");

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }

    }
}
