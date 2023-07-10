package array_Program;

//check if the given element in an array is sorted or not , if sorted return true else return false.

import java.util.Scanner;
// check the array is sorted array or not , if sorted return true esle return false.
public class Check_SortedArray {

    public static boolean isSorted(int arr[]){
        int size=arr.length;
        Boolean check=true;

        for(int i=1;i<size;i++){
            if(arr[i]<arr[i-1]){
                    check=false;
                    break;
                }

        }
        return check;
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

        if(isSorted(arr)==true){
            System.out.println("The array is sorted.");
        }else{
            System.out.println("The array is not sorted.");
        }
    }
}

