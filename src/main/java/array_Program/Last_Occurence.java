package array_Program;

import java.util.Scanner;
// find the last occurence of given element , and its  index else return -1.
public class Last_Occurence {

    static int lastOcurrenece(int[] arr, int x){
        int n=arr.length;
        int lastindex= -1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                lastindex=i;
            }
        }
        return lastindex;
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
        System.out.println("Enter X");
        int x=sc.nextInt();


        System.out.println("Last ocurrence of an element is :" + lastOcurrenece(arr,x));





    }
}
