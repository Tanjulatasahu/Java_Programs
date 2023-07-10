package collection.set;
// Given an unsorted array of integers nums, return the length of the longest
// consecutive elements sequence.

import java.util.HashSet;

// Input : nums[] ={100,4,200,1,3,2};
//ouput : 4 ---- Then longest consecutive element sequence is [1,2,3,4].Therefore the length is 4.
//Time complexity o(n) time.
public class Longest_consecutive_sequence {
    public static void main(String[] args){
        int nums[]={100,4,200,1,3,2};

        int length=longestConsecutive(nums);
        System.out.println(length+" ");
    }

    public static int longestConsecutive(int[] nums){
        HashSet<Integer> st=new HashSet<>();
        int maxLength=0;

        for(int num:nums){
            st.add(num);
        }

        for(int num:st){
            if(!st.contains(num-1)){  // check the starting point
                int curNum=num;
                int currLength=1;   // length of current consecutive sequence
                while(st.contains(curNum+1)){
                    curNum++;
                    currLength++;
                }
                maxLength=Math.max(maxLength,currLength);
            }
        }
        return maxLength;
    }
}
