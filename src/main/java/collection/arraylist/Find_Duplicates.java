package collection.arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class Find_Duplicates {
    public static  void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Mahesh");
        list.add("Mangesh");
        list.add("Mahesh");
        list.add("Naveen");
        list.add("Mangesh");

        HashSet<String> set =new HashSet<>();
        for(String s:list){
            if(set.add(s)==false){
                System.out.println(s+ " ");
            }
        }
    }

}
