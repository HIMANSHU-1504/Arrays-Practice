//  Find Maximum Element in Array

public class prog3 {
    public static void main(String[] args) {
        int nums[] = {5, 8, 2, 7, 1};

        int max = nums[0];

        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        
        System.out.println("Maximum element in array :- " + max);
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/