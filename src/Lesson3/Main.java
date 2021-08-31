package Lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arraySize = (int) (Math.random() * 20);
        int num = (int) (Math.random() * (arraySize+1));
        int[] array = new int[arraySize];
        if (arraySize !=0){
            for (int i = 0; i < arraySize; i++) {
                if (i >= num) array[i] = i + 2;
                else array[i] = i + 1;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(SearchNum(array));
    }

    public static int SearchNum(int[] arr) {
        if (arr.length == 0 || arr[0] != 1) return 1;
        else if (arr[arr.length-1] - arr[0] == arr.length-1) return arr[arr.length-1]+1;
        else if (arr.length == 2) return arr[0]+1;
        else {
            int start = 0;
            int end = arr.length-1;
            while (end - start > 1) {
                int m = (end - start)/2;
                if (arr[start+m] - arr[start+m-1] != 1) return arr[start+m]-1;
                else if(arr[start+m-1] - arr[start] != m-1) {
                    end = start + m-1;
                }
                else {
                    start = start + m;
                }
            }
            return arr[start]+1;
        }
    }
}
