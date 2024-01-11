public class question1 {

    public static void placingValue(int[] arr){
        int[] ans = new int[arr.length*2];
        
        for(int i = 0; i < ans.length; i += 2){
            ans[i] = arr[i / 2];
            ans[i + 1] = arr[arr.length - 1 - (i / 2)];
        }

        for(int num: ans){
            System.out.print(num + " ");
        }
    }

    public static void skipingValue(int[] arr, int n){
        int[] res = new int[n/2];
        int resIndex = 0; // Separate index for res array

        // Collect values to print and place at odd indexes
        for (int i = n - 1; i >= 0; i -= 2) {
            res[resIndex++] = arr[i];
        }

        // Print the collected values
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }

        System.out.println("\nAfter placing values:");

        // Place the collected values at odd indexes of the original array
        placingValue(res);
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;

        System.out.println("Array Elements after skipping are:");
        skipingValue(arr, n);
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/