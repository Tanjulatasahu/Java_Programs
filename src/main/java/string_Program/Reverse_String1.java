package string_Program;

import java.util.Scanner;
// reverse each word in a given string.
 // Input: this is java programming
//  output : siht si avaj gnimmargorp
public class Reverse_String1 {
    public static String reverse(String str){
        if(str==null){
            return str;
        }

      String[] words=str.split(" ");

      String reverseword="";
      for(String w:words){
          String reword="";
          for(int i=w.length()-1;i>=0;i--){
              reword=reword+w.charAt(i);
          }
          reverseword=reverseword+reword+" ";
      }
      return reverseword.trim();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        String reverseString = reverse(str);
        System.out.println(reverseString);
    }
}
