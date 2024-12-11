package com.example.string;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(areAnagrams("roma", "amor"));
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] count = new int[26];
        for (char c : s1.toCharArray()) count[c - 'a']++;
        for (char c : s2.toCharArray()) {
            if (--count[c - 'a'] < 0) return false;
        }
        return true;
    }
    
}
