package com.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***
 * Encontrar um subarray com soma igual a um alvo dado.
 */
public class TwoPointer {
    public static void main(String[] args) {
        int[] result = subarrayWithTargetSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));
    }

    public static int[] subarrayWithTargetSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == target)
                return new int[] { 0, i };
            if (map.containsKey(sum - target))
                return new int[] { map.get(sum - target) + 1, i };
            map.put(sum, i);
        }
        return new int[] { -1, -1 }; // Subarray não encontrado
    }

}
