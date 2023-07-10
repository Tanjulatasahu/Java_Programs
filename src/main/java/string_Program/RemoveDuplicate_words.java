package string_Program;

import java.util.Scanner;

public class RemoveDuplicate_words {
    public static String removeDuplicateWord(String str){
        str=str.toLowerCase();
        String[] s=str.split(" ");
        String unique="";

        for(int i=0;i<s.length;i++){
            int count =1;
            for(int j=i+1;j<s.length;j++){
                if(s[i].equals(s[j])){
                    count++;
                    s[j]="0";
                }
            }
            if(s[i]!="0" && count==1)
                unique=unique+s[i]+" ";

        }
        return unique.trim();
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        String words=removeDuplicateWord(str);
        System.out.println(words);

    }
}
