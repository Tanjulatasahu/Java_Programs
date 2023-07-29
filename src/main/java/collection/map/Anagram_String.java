package collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Anagram_String {

    public static Boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mp= makeFreqMap(s);
        HashMap<Character,Integer>  mp1 =makeFreqMap(t);
        return mp.equals(mp1);

    }

    public static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer>  mp=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }else{
                mp.put(ch,1);
            }
        }
        return mp;
    }

    public static void main(String[] args){
        String s="knee";
        String t="keen";
        System.out.println("Both the string is anagram or not"+ " " + isAnagram(s,t));
    }
}
