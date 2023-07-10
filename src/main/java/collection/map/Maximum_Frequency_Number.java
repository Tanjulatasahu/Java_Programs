package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
// Ninja is given an array of integers that contain numbers in random order.
//  He needs to write a program to find and return the number which occurs the maximum times
// in the given input. He needs your help to solve this problem.
// If two or more elements contains for the maximum frequency, return the element which occurs in the
// array first i.e whose index is lowest.
public class Maximum_Frequency_Number {

    public static void maxFrequency(int[] arr){
        int size=arr.length;
        int maxFreq=0;
        int element=0;
        Map<Integer,Integer> hs=new LinkedHashMap<>();

        for(int num:arr){
            if(hs.containsKey(num)){
                hs.put(num,hs.get(num)+1);
            }
            else{
                hs.put(num,1);
            }
        }

         Set<Integer> number=hs.keySet();
        for(int n:number){
            if(maxFreq<hs.get(n)){
                maxFreq=hs.get(n);
                element=n;
            }
        }

        System.out.println(element +"  "+maxFreq);


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
        maxFrequency(arr);


    }
}
