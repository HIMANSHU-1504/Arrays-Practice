class question2 {

    public static void main(String[] args) {
        // Create and populate the arrays
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {11, 12, 13, 14, 15, 16, 17, 18};

        // Display the arrays before copying
        System.out.println("Before copying:");
        displayArray("a1", a1);
        displayArray("a2", a2);

        // Copy the first 4 elements of a2 into the first 4 elements of a1
        for (int i = 0; i < 4; i++) {
            a1[i] = a2[i];
        }

        // Copy the last 3 elements of a1 into the first 3 elements of a2
        for (int i = 0; i < 3; i++) {
            a2[i] = a1[a1.length - 3 + i];
        }

        // Display the arrays after copying
        System.out.println("After copying:");
        displayArray("a1", a1);
        displayArray("a2", a2);
    }

    // Helper method to display the elements of an array
    private static void displayArray(String name, int[] array) {
        System.out.print(name + " = ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
