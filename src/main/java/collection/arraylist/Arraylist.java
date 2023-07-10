package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> ar1=new ArrayList<>();
        ar1.add("java");
        ar1.add("python");
        ar1.add("ruby");
        ar1.add("javascript");

        ArrayList<String> ar2=new ArrayList<>();
        ar2.add("testing");
        ar2.add("devops");

        //ar1.addAll(ar2);
        //ar1.clear();
        //ar1.contains("pyhton");
        //ar1.indexOf("ruby");
        //ar1.lastIndexOf("ruby");
        //ar1.remove(2);
        //ar1.subList(startindex,endindex);

        ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7));
        arr1.removeIf(num -> num%2==0);
        System.out.print(arr1);

    }
}
