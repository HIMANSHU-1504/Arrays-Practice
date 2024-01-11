// Reverse an Array


public class prog5 {

    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void reverse(int[] nums, int low, int high){
        if(low>=high){
            return;
        }
        swap(nums,low,high);
        reverse(nums, low+1, high-1);

    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        int n = nums.length;

        int low = 0;
        int high = n-1;

        reverse(nums, low, high);    

        System.out.println("Array after reversing :- ");
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/