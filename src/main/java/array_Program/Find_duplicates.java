package array_Program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_duplicates {

    public static void main(String[] args) {

        //Approach 1- Brute force
        String[] arr= {"java","python","c","c++","java","c","java"};


        for(int i=0;i<arr.length;i++) {
            int count=1;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                    arr[j]="0";
                    //System.out.print(arr[i]+ " ");


                }

            }
            if(arr[i]!="0" && count>1){
                System.out.print(arr[i]+ " ");
            }
        }


        System.out.println();


        // Approach 3
        // using stream
//        List<String> arrData= Arrays.asList(arr);
//        Set<String> data=new HashSet<String>();
//
//        Set<String> dataList=arrData.stream()
//                .filter(e->!data.add(e))
//                .collect(Collectors.toSet());
//        System.out.println(dataList);
    }
}
