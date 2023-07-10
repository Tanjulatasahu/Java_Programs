package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates_Arraylist {
    public static void main(String[] args){

        //By using Hashset
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,1,2,3,2,5,6,3,3,5));
        HashSet<Integer> hs=new HashSet<>(al);
        System.out.println(hs);

        //By using stream
        ArrayList<Integer> marks=new ArrayList<>(Arrays.asList(1,1,2,3,2,5,6,3,3,5));
        List<Integer> markslist=marks.stream().distinct().collect(Collectors.toList());
        System.out.println(markslist);
    }
}
