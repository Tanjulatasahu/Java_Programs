package string_Program;

public class Count_vowel {
    public static  void main(String[] args){
        String str="Hey Everyone";
        str=str.toLowerCase();
        int countVowel=0;
        int countConsonant=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                countVowel++;
            }
            else{
                countConsonant++;
            }
        }
        System.out.println("vowel"+" "+countVowel);
        System.out.println("consonant"+" "+countConsonant);
    }
}
