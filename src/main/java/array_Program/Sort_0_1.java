package array_Program;

import java.util.Scanner;

//sort an array consisting of os and 1s
public class Sort_0_1 {
    public static int[] sort(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }

        }
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
        int[] ans=sort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
