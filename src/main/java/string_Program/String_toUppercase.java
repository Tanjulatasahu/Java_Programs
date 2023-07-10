package string_Program;

public class String_toUppercase {

   static String capitalise(String str){

       if(str==null){
           return str;
       }

       if(str.length()==1){
           return str.toUpperCase();
       }

       String[] word = str.split("\\s");
       String result="";
       for(String wrd:word){
           String first_word=wrd.substring(0,1).toUpperCase();
           String next_word=wrd.substring(1);
           result=result+first_word+next_word+" ";
       }
       return result.trim();
    }


    public static void main(String[] args){

       String final_result = capitalise("this is java programming");
       System.out.println(final_result);
    }
}
