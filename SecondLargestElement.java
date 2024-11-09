import java.util.*;

public class SecondLargestElement {

    static int FindSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > secondLargest && arr[i] != max){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt(); sc.nextLine();
        }

        int result = FindSecondLargest(arr);

        System.out.println(result);

        
    }   
}

//Time complexity = O(2N)
