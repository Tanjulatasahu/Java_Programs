package string_Program;
// wrong program
// print character in descending order of frequency
public class Character_descending_frequency {
    public static void main(String[] args){
        String str="aaabcdee";
        int total_char=256;
        int frequency[]=new int[total_char];

        for(int i=0;i<str.length();i++){
            frequency[(int)(str.charAt(i))]++;
        }

        for(int i=0;i<frequency.length;i++){
            for(int j=i+1;j<frequency.length;j++){
                if(frequency[i]<frequency[j]){
                    int temp=frequency[i];
                    frequency[i]=frequency[j];
                    frequency[j]=temp;
                }
            }
            System.out.println((char)i+"  "+frequency[i]);
        }
    }
}
