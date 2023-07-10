package array_Program;

import java.util.Arrays;
import java.util.Scanner;

//given an array element , return the smallest and largest element in the form of an array.
// example : arr[] ={2, 5, 4, 3,2}
             // output : {2,5}
public class Largest_Smallest {

    public static int[] smallestAndLargeest(int[] arr){
        Arrays.sort(arr);
        int ans[]={arr[0],arr[arr.length-1]};
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

        int[] ans=smallestAndLargeest(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }

    }
}
