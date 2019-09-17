package searching;

import java.util.Scanner;

/*
Compares each element in the list with key, and returns index at which the element is present.
Else returns -1
Time Complexity: O(n)
Space Complexity: O(1)
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7, 9, 11, 23};
        int count = 7;
        Scanner sc = new Scanner(System.in);
        while (count-- > 0) {
            System.out.println("Enter key: ");
            int key = sc.nextInt();
            linearSearchIterative(array, key);
        }
    }

    public static void linearSearchIterative(int[] array, int key){
        if(array==null || array.length==0 || key=='\0'){
            System.out.println("Iterative Linear Search: Invalid Input");
            return;
        }

        for(int i=0;i<array.length;i++){
            if(key == array[i]){
                System.out.println("Iterative Linear Search: Element " + key + " found at index:" + i);
                return;
            }
        }
        System.out.println("Iterative Linear Search: Element " + key + " not found in list");
    }
}
