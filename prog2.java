//  Calculate Average of Array Elements


public class prog2 {
    public static void main(String[] args){
        int[] nums = {10, 20, 30, 40, 50};

        int n = nums.length;

        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        System.out.println("Average of Array Elements :-");
        System.out.println(sum/n);
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/