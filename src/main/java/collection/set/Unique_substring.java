package collection.set;

import java.util.HashSet;

public class Unique_substring {
    public static void main(String[] args){
        String input="Hello";
        HashSet<String> hs=new HashSet<String>();

        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<=input.length();j++){
                hs.add(input.substring(i,j));
            }
        }

        for(String s:hs){
            System.out.print(s+" ");
        }
    }
}
