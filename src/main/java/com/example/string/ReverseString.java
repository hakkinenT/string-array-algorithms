package com.example.string;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("banana"));
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }
    
}
