// Count Even and Odd Numbers


public class prog7 {
    public static void main(String[] args){
        int[] nums = {2, 5, 8, 3, 6, 7};

        int even = 0;
        int odd = 0;

        for(int num : nums){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Even numbers: "+ even +" Odd numbers: " + odd);
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/