package com.example.string;


public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("arara"));
        System.out.println(isPalindrome(123454321));
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int x){
        if(x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
    
        return original == reversed;
    }
}
