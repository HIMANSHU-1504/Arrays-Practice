// Find Duplicate Elements

import java.util.*;
public class prog8 {
    public static void main(String[] args){
        int[] nums = {3, 5, 2, 7, 3, 8, 2};

        List<Integer> ans = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    ans.add(nums[i]);
                }
            }
        }
        System.out.println("Duplicate Elements: "+ans);
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/