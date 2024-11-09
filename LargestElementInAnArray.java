
// Given an array arr[]. The task is to find the largest element and return it.

// Input: 3
// 20
// 90
// -10
// Output: 90
// Explanation: The largest element of the given array is 90.


import java.util.*;

public class LargestElementInAnArray{

    static int FindLargestElement(int[] arr, int size){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt(); sc.nextLine();
        }

        int result = FindLargestElement(arr, size);
        System.out.println(result);
    }
}