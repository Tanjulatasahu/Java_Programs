package array_Program;
// Given an array a consisting of integers.Return the last value that is repeating in this array.If
// no value is being repeated , return -1.

import java.util.Scanner;

public class Last_Value {

    static int lastValue(int[] arr){
        int n=arr.length;
        int lastvalue=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    lastvalue=arr[i];
                }
            }
        }
        return lastvalue;
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



        System.out.println("Last value is :" + lastValue(arr));





    }
}
