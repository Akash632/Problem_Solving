import java.util.*;

public class Math_Problems {

    //1. Count the Number of Digits

    // Your given a integer N and your task is to calculate and return the number of digits of the given integer N

    // Example 1:
    // Input:
    // N- 123

    // Output:
    // 3

    // Explanation: The number 123 has 3 digits.

    // static int countDigits(int n){
    //     int count = 0;

    //     while(n!=0){
    //         n=n/10;
    //         count++;
    //     }

    //     return count;
    // }


    //2. Counting Digits That Evenly Divide a Number

    // Given an integer N, your task is to count how many of its digits can divide N completely without any remainder.
 
    // Example 1:
    // Input:
    // N = 12

    // Output:
    // 2

    // Explanation: Both 1 and 2 can evenly divide 12.

    // static int evenDivides(int n){

    //     int count =0;
    //     int copy = n;
    //     while(n!=0){
    //         int rem = n%10;
    //         if(copy%rem == 0){
    //             count++;
    //         }

    //         n=n/10;
    //     }

    //     return count;
    // }


    //3. Reverse A Number

    // You are given an integer N. Your task is to reverse the given number, 
    //ensuring that the reversed number has no leading zeroes and return it.

    // Example 1:
    // Input:
    // 122

    // Output:
    // 221

    // Explanation:
    // When you reverse the digits of the number 122, it becomes 221

    // Example 2:
    // Input:
    // 200

    // Output:
    // 2

    // static int reverseNum(int n){
    //     int rev = 0;
        
    //     while(n!=0){
    //         int rem = n%10;
    //         rev = rev*10 + rem;
    //         n=n/10;
    //     }

    //     return rev;
    // }

    //4. Checking for Palindromic Numbers

    // You are given an integer n Your task is to determine whether n is a palindromic number or not.

    // Example 1:
    // Input:
    // n = 555

    // Output:
    // Yes

    // Explanation: The number 555 is a palindrome because it reads the same backward as forward.

    static String checkPalindrome(int n){
        int copy=n;
        int rev=0;

        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }

        if(copy == rev) return "Yes";
        else return "No";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String result = checkPalindrome(n);

        System.out.println(result);

        sc.close();

    }
}
