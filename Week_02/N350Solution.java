import java.util.Arrays;

public class N350Solution {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,2,1};
        int[] b = new int[] {2,2};
        System.out.println( Arrays.toString(intersect(a,b)));
    }
    public static int[] intersect(int[] nums1,int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length ) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
