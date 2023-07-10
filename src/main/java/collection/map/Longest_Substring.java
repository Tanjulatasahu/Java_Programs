package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Longest_Substring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        longestSub(str);

    }

    public static void longestSub(String str){
        int longestSubLength=0;
        String longestSubstring=null;

        char[] arr=str.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();

        for(int i=0;i<arr.length;i++){
            char c=arr[i];

            if(!map.containsKey(c)){
                map.put(c,i);
            }else{
                i=map.get(c);
                map.clear();
            }
            if(map.size()>longestSubLength){
                longestSubLength=map.size();
                longestSubstring=map.keySet().toString();
            }
        }

        System.out.println(longestSubstring+"  "+longestSubLength);



    }

}
