package array_Program;

import java.util.Scanner;
// Left  Rotate an array k times
// Input : arr[] ={1,2,3,4,5} , k=2
// output: {2,3,4,5,1}
public class K_LeftRotate {



        public static void swap(int[] arr, int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }

        public static void reverse(int[] arr,int i, int j){
            while(i<j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        public static int[] rotate(int[] arr,int k){
            int n= arr.length;
            k=k%n;
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
            reverse(arr,0,n-1);
            return arr;
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
            System.out.println("Enter K:");
            int k=sc.nextInt();

            int[] ans=rotate(arr,k);
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+ " ");
            }
        }

}
