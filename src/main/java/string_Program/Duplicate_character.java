package string_Program;

import java.util.Scanner;

public class Duplicate_character {
    public static void duplicateChar(String str){
        str=str.toLowerCase();
        char[] s=str.toCharArray();

        for(int i=0;i<s.length;i++){
            int count =1;
            for(int j=i+1;j<s.length;j++){
                if(s[i]==(s[j])){
                    count++;
                    s[j]='0';
                }
            }
            if(s[i]!='0' && s[i]!=' ' && count>1)
                System.out.println(s[i]+" - "+ count);
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        duplicateChar(str);

    }
}
