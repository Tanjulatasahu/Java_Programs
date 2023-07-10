package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class First_NonRepeating_word {
    public static void nonRepeating(String str){
        String[] s=str.split(" ");
        Map<String,Integer> hs=new LinkedHashMap<>();

        for(String w: s){
            if(hs.containsKey(w)){
                hs.put(w.toLowerCase(),hs.get(w)+1);
            }
            else{
                hs.put(w.toLowerCase(),1);
            }


        }


        Set<String> word=hs.keySet();
        for(String s1:word){
            if(hs.get(s1)==1){
               System.out.println(s1);
               break;
            }
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        nonRepeating(str);


    }
}
