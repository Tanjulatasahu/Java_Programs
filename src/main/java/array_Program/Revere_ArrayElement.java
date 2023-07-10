package array_Program;
// reverse an array element.
public class Revere_ArrayElement {
    public static void main(String[] args) {

        //approach 1
        String[] arr= {"java","python","c","c++","command","generate","ragi"};
        int j=arr.length-1;

        for(int i=0;i<arr.length;i++) {

            if(i<j) {
                String val=arr[i];
                arr[i]=arr[j];
                arr[j]=val;
                j--;

            }
            System.out.print(arr[i]+"  ");


        }
        System.out.println();

        //Approach 2
        String[] arr1= {"java","python","c","c++","command","generate","ragi"};

        for(int i= arr1.length-1;i>=0;i--) {

            System.out.print(arr1[i]+"  ");
        }


    }
}
