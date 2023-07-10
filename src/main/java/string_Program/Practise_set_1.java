package string_Program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Practise_set_1 {
    //Normal method
    static String[] arr={"t","r","p"};

    public static void main(String[] args) {

        String join = String.join("*",arr);
        System.out.print(join);

        System.out.println();

        //By using stream
        String join1= Arrays.asList(arr).stream().collect(Collectors.joining("*"));
        System.out.print(join1);

        System.out.println();

        // For integer
        //int[] arr1={1,2,4,7,99,11};
        String join2= Arrays.asList(1,2,4,7,99,11).stream().map(e->e.toString()).collect(Collectors.joining("*"));
        System.out.println(join2);
    }
}
