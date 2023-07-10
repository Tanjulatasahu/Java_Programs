package collection.map;

import java.util.*;

public class Count_Duplicates {

     public static void count(String str){
         String[] s=str.split(" ");
         Map<String,Integer> hs=new LinkedHashMap<>();

         for(String w: s){
             if(!w.isBlank()) {
                 if (hs.containsKey(w)) {
                     hs.put(w.toLowerCase(), hs.get(w) + 1);
                 } else {
                     hs.put(w.toLowerCase(), 1);
                 }
             }

         }

         Set<String>  word=hs.keySet();
         for(String s1:word){
             if(hs.get(s1)>1){
                 System.out.println(s1 + ":" + hs.get(s1));
             }
         }
     }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        count(str);

    }
}
