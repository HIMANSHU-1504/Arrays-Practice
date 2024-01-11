public class question3 {

    public static void main(String[] args) {
        // Create and initialize an array
        int[] array = {4, 8, 6, 1, 2, 9, 4};

        // Display the array
        System.out.print("Array: ");
        displayArray(array);

        // Find and print the neighboring numbers with the smallest distance
        findMinDistanceNeighboringNumbers(array);
    }

    // Helper method to display the elements of an array
    private static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper method to find and print neighboring numbers with the smallest distance
    private static void findMinDistanceNeighboringNumbers(int[] array) {
        int minDistance = Integer.MAX_VALUE;
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int currentDistance = Math.abs(array[i] - array[i + 1]);

            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                firstIndex = i;
                secondIndex = i + 1;
            }
        }

        if (firstIndex != -1 && secondIndex != -1) {
            System.out.println("Numbers: " + array[firstIndex] + " (index " + firstIndex + ") , "
                    + array[secondIndex] + " (index " + secondIndex + ")");
        } else {
            System.out.println("No neighboring numbers found.");
        }
    }
}


// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/