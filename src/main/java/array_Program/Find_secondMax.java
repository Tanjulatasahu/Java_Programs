package array_Program;

import java.util.Scanner;
//find maximum and second maximum number in an array.
public class Find_secondMax {

    static int secondMax(int[] arr){
        int mx=max(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;

            }
        }
        int secondmax=max(arr);
        return secondmax;
    }

    static int max(int[] arr){
        int mx=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    public static void main(String[] args){

        /*Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter" + " " + n + " " + "elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }*/

        int[] arr = {7, -10, -9, -6, -8};

       // System.out.println("Second maximum  element is :" + new MaxFromArray().get2ndMostElementFromArray(arr));





    }
}
