package collection.set;

import java.util.HashSet;
import java.util.Set;

public class Find_duplicates {

    public static void main(String[] args){
        String[] arr= {"java","python","c","c++","java","c"};

        Set<String> dup=new HashSet<String>();

        for(String val:arr) {
            if(dup.contains(val)) {
                System.out.print(val+ "  ");
            }else {
                dup.add(val);
            }
        }
    }
}
