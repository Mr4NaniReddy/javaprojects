
import java.util.*;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        
    
    int[] arr = {1,5,8,4,3,2,9};
    int r = arr.length-1;
    int c = 0;
    System.out.println(Arrays.toString(bubblesort(arr, r, c)));

    }

    static int[] bubblesort(int[] arr, int r, int c){
        if(r == 0){
            return arr;
        }
        if(c<r){
            if(arr[c] > arr[c+1]){
                swap(arr, c+1, c);
               
            }
            bubblesort(arr, r, c+1);
        }
        else{
            bubblesort(arr, r-1, 0);
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


