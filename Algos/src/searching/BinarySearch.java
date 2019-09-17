package searching;

import java.util.Scanner;

/*
    To search elements in a SORTED list of elements
    It compares the middle element in the list with the key i.e element to search for
    Since the list is sorted, it can only be in 3 places:
        1. In the middle of the list
        2. Left half of the list
        3. Right half of the list
    Since we divide the input set in half for every iteration/recursive call,
    Time Complexity : O(log n)
    Space Complexity : O(1) because we are doing this search in place
*/
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7, 9, 11, 23};
        int count = 7;
        Scanner sc = new Scanner(System.in);
        while (count-- > 0) {
            System.out.println("Enter key: ");
            int key = sc.nextInt();
            binarySearchIterative(array, 0, array.length - 1, key);
            binarySearchRecursive(array, 0, array.length - 1, key);
        }
    }

    public static void binarySearchIterative(int[] array, int start, int end, int key) {
        if (array == null || array.length == 0 || key == '\0') {
            System.out.println("Iterative Binary Search: Invalid Input");
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == array[mid]) {
                System.out.println("Iterative Binary Search: Element " + key + " found at index:" + mid);
                return;
            } else if (key < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Iterative Binary Search: Element " + key + " not found in list");
        return;
    }

    public static void binarySearchRecursive(int[] array, int start, int end, int key) {
        if (array == null || array.length == 0 || key == '\0') {
            System.out.println("Recursive Binary Search: Invalid Input");
            return;
        }
        if (end < start) {
            System.out.println("Recursive Binary Search: Element " + key + " not found in list");
            return;
        }
        int mid = start + (end - start) / 2;
        if (key == array[mid]) {
            System.out.println("Recursive Binary Search: Element " + key + " found at index:" + mid);
        } else if (key < array[mid])
            binarySearchRecursive(array, start, mid - 1, key);
        else
            binarySearchRecursive(array, mid + 1, end, key);
    }
}
