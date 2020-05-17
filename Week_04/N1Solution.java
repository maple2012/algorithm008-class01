package com.web.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class N1Solution {
    public static void main(String[] args) {
        int[] a = {10,2,1,2,3,4};
        int b = 5;
        System.out.println(Arrays.toString(twoSum(a,b)));

    }
    public static int[] twoSum(int[] numbers,int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0;i<numbers.length;i++) {
            if(map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i],i);
        }
        return result;


        
    }
}