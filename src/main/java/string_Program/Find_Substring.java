package string_Program;
import java.util.*;

public class Find_Substring {
    // str= "abcd";
    //output : a ,ab,abc,abcd,b,bc,bcd,c,cd,d;
    public static void main(String[] args){

        String str="Hello";
        int length=str.length();
        for(int i=0;i<length;i++){
            for(int j=i+1;j<=length;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }


}
