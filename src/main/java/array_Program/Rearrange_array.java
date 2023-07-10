package array_Program;
// Rearrange given array by splitting in half and inserting second half in reverse at alternate position.
public class Rearrange_array {

    public static void main(String[] args){

        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int  arr1[]=new int[n];
        int i=0;
        int j=n-1;
//
        for( int k=0; k<n; k++){
            if(k%2==0){
                arr1[k]=arr[i++];
            }
            else{
                arr1[k]=arr[j--];
            }
        }

        for(int k=0;k<arr1.length;k++){
            System.out.print(arr1[k]+" ");
        }

    }


}
