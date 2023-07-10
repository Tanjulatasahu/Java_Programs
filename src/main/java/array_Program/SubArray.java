package array_Program;

public class SubArray {

    public static void main(String[] args){
        int [] arr={1,-2 ,3,-4};
        //int negativeCount=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    //sum=sum+arr[k];
                    System.out.print(arr[k]+" ");

                }
                System.out.println();
//                if(sum<0){
//                    negativeCount++;
//                }
            }


    }
        //System.out.println(negativeCount+" ");
    }
}
