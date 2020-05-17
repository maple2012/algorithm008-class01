package com.web.leetcode;

public class N31Solution {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 2;
        System.out.println(test(arr,target));

    }
    static boolean test(int[] arr,int target){
        if(arr.length == 0 || arr == null) {
            return false;
        }
        int start = 0;
        int end = arr.length-1;
        int mid;
        while (start <= end) {
            mid = start + (end-start)/2;
            if(arr[mid] == target) return true;
            if(arr[mid] == arr[start]) start++;
            if(arr[start] < arr[mid]) {
               if(arr[mid] > target && arr[start] <= target) {
                   end = mid-1;
               }else {
                   start = mid + 1;
               }
            }else {
                if(arr[end] >= target && arr[mid] < target ) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return  false;

    }
}
