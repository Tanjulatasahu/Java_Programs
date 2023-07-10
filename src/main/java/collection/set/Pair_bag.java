package collection.set;

import java.util.HashSet;

//// You are given n distinct pairs. Each pair is numbered from 1 to n. All these pairs are
// intially put in a bag. You need to pair up each number. You take numbers one by one from the bag
//and for each number you look whether the pair of this number has already been taken out of the bag, or not.
// If not(that means the pair of this number is still in the bag), you put the current number on the
//table in front of him. Otherwise, you put both numbers from the pair aside.
//Print the maximum number of numbers that were on the table at the same time.

//Input : 3-pair  {2,1,1,3,2,3}
//output : 2

public class Pair_bag {

    public static void main(String[] args){
        int arr[]={2,3,1,2,1,3};  // n= 3 pair
        int maxNum=maxNumberOnTable(arr);
        System.out.println(maxNum);
    }

    public static int maxNumberOnTable(int[] bag){
        HashSet<Integer> table=new HashSet<>();
        int max=0;

        for(int i=0;i<bag.length;i++){
            int num=bag[i];
            if(table.contains(num)){
                table.remove(num);
            }else{
                table.add(num);
                max=Math.max(max,table.size());
            }
        }
        return max;
    }
}
