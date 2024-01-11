// Find Prime Numbers in Array


public class prog11 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findPrimes(int[] nums) {
        System.out.print("Prime Numbers in Array: ");
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println(); // Add a newline after printing the prime numbers
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 4, 9};

        findPrimes(arr);
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/