//  Find Minimum Element in Array

public class prog4 {
    public static void main(String[] args) {
        int nums[] = {15, 3, 9, 12, 5};

        int min = nums[0];

        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        
        System.out.println("Minimum element in array :- " + min);
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/