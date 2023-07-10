package string_Program;

import java.util.Scanner;

// Input: str1 = abcde    , str2=cdeab
// output : true
// str2 is rotation of str1
public class Check_Rotation {
    public static Boolean checkRotation(String str1,String str2){
      String temp=str1+str1;
      if(str1.length()!=str2.length()){
          return false;
      }
      if(temp.indexOf(str2)==-1){
          return false;
      }
      else{
          return true;
      }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the one string : ");
        String str1=sc.nextLine();
        System.out.println("Enter another string : ");
        String str2=sc.nextLine();

        checkRotation(str1,str2);
        if(checkRotation(str1,str2)){
            System.out.println("One string is rotation of another string");
        }else{
            System.out.println("One string is not rotation of another string");
        }
    }
}
