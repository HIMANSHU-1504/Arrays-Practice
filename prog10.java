// Common elements in array

import java.util.HashSet;

public class prog10 {

    public static void findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> commonElements = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        System.out.print("Common elements: ");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {3, 6, 9, 2, 5};
        int[] array2 = {5, 2, 8, 1, 7};

        findCommonElements(array1, array2);
    }
}

// This article is Contributed by Himanshu Jha.
// Connect with me on linkedin https://www.linkedin.com/in/himanshujhaa/