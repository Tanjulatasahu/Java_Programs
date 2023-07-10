package collection.arraylist;

import java.util.Arrays;
import java.util.ArrayList;

public class Arraylist_to_Arrays {
    public static  void main (String[] args){

        ArrayList<String> arr1=new ArrayList<String>(Arrays.asList("naveen","tom","peter","steve"));
        Object [] arr=arr1.toArray();
        for(Object name:arr){
            System.out.println((String)name);
        }
    }
}
