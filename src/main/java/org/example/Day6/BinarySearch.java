package org.example.Day6;

/**
 * BinarySearch class demonstrates the binary search algorithm.
 *
 * What is Binary Search?
 * Binary Search is an algorithm used to find an element in a sorted array.
 *
 * Instead of checking every element one by one, it works by dividing the array into halves.
 *
 * Steps:
 * 1. Look at the middle element.
 * 2. If it’s the target → return it.
 * 3. If the target is smaller → search in the left half.
 * 4. If the target is bigger → search in the right half.
 *
 * This process continues until the element is found or the array can’t be divided anymore.
 *
 * It’s much faster than linear search because it reduces the search space by half each time.
 *
 * Time complexity: O(log n)
 *
 * Example usage:
 * int[] numbers = {2, 4, 6, 8, 10, 12, 14};
 * int index = BinarySearch.binarySearch(numbers, 10);
 *
 * @author Alzahraa
 * @version 1.0
 */
public class BinarySearch {

    /**
     * Searches for a target element in a sorted array using binary search algorithm.
     *
     * @param arr The sorted array of integers to search in.
     * @param target The integer value to search for.
     * @return The index of the target element if found, otherwise -1.
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;  // target found
            } else if (arr[mid] < target) {
                left = mid + 1;  // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }
        return -1; // not found
    }

    /**
     * Main method to test the binary search.
     *
     * @param args Command line arguments (not used here)
     */
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
