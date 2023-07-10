package array_Program;

import java.util.Scanner;
// sort array elements in asecending and decending order
public class Sort_Array {
    // Sort array in ascending order
    static int[] sortArray(int[] arr){
        int length=arr.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    // Sort array in descending order

    static int[] sortArrayDes(int[] arr){
        int length=arr.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
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

        System.out.println("Acsending order sorting"+ " ");
        sortArray(arr);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        System.out.println("Descending order sorting"+ " ");
        sortArrayDes(arr);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }



    }


}
