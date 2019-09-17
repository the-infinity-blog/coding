package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 2, 3, 6, 4, 3, 9, 16, 5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        if (array == null || array.length <= 1)
            return;
        int[] left = new int[array.length/2];
        int[] right = new int[array.length-left.length];

        System.arraycopy(array,0,left,0,left.length);
        System.arraycopy(array,left.length,right,0,right.length);

        sort(left);
        sort(right);

        merge(array,left,right);
    }

    public static void merge(int[] array, int[] left, int[] right){
        int index=0;
        int left_index=0;
        int right_index=0;

        while(left_index < left.length && right_index < right.length){
            if(left[left_index]<=right[right_index])
                array[index++]=left[left_index++];
            else
                array[index++]=right[right_index++];
        }
        System.arraycopy(left,left_index,array,index,left.length-left_index);
        System.arraycopy(right, right_index, array, index, right.length-right_index);
    }
}
