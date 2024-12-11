package com.example.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5}, 4));
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Elemento não encontrado
    }
    
}
