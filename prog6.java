// Check if Array is Sorted


public class prog6 {

    public static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        int[] nums = {4, 7, 9, 12, 15};

        if(isSorted(nums)){
            System.out.println("Array is sorted in ascending order.");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/