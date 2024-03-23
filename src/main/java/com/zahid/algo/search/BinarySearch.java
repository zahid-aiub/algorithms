package com.zahid.algo.search;

public class BinarySearch {
    public static void main(String[] args) {

        System.out.printf("::::: Binary Search :::::\n");
        // Test case 1: Target present in the array
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target1 = 5;
        assert binarySearch(arr1, target1) == 4;

        // Test case 2: Target not present in the array
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target2 = 10;
        assert binarySearch(arr2, target2) == -1;

        // Test case 3: Empty array
        int[] arr3 = {};
        int target3 = 5;
        assert binarySearch(arr3, target3) == -1;

        // Test case 4: Single element array
        int[] arr4 = {5};
        int target4 = 5;
        assert binarySearch(arr4, target4) == 0;

        // Test case 5: Array with duplicate elements
        int[] arr5 = {1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int target5 = 2;
        assert binarySearch(arr5, target5) == 1 || binarySearch(arr5, target5) == 2;

        System.out.println("All test cases are passed!");
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
