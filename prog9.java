// Remove Duplicate Elements

public class prog9 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 4, 9, 2, 5};

        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] != nums[j]){
                    ans[i] = nums[i];
                }
            }
        }

        System.out.println("After removing duplicates :- ");
        for(int i=0;i<ans.length-1;i++){
            System.out.print(nums[i]+" ");
        }
        
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/