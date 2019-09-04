package leetcode.test1;
//合并两个有序数组
public class Solution4 {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int[] nums1 ={1,2,3,0,0,0};
        int[] nums2 ={2,5,6};
        int i = 0 ,j = 0, k = 0;
        int[] ints = new int[m + n];
        while (i < nums1.length && j < nums2.length) {
            if (i > m-1) {
                i++;
            }else if (nums1[i]<nums2[j]){
                ints[k] = nums1[i];
                k++;
                i++;
            } else if (nums1[i] >= nums2[j]) {
                ints[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < nums1.length ) {
            if (i > m-1) {
                i++;
            }else {
                ints[k] = nums1[i];
                k++;i++;
            }
        }
        while (j < nums2.length ) {
            if (j > n-1) {
                j++;
            }else {
                ints[k] = nums2[j];
                k++;j++;
            }
        }
        for (int e = 0; e < nums1.length; e++) {
            nums1[e] = ints[e];
            System.out.println(nums1[e]);
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int index = m + n - 1;
        int indexA = m - 1;
        int indexB = n - 1;
        for (int i = index; i >= 0; i--) {
            if (indexA == -1 || indexB == -1) {
                break;
            }
            if (nums1[indexA] > nums2[indexB]) {
                nums1[i] = nums1[indexA];
                indexA--;
            } else {
                nums1[i] = nums2[indexB];
                indexB--;
            }
        }
        while (indexB >= 0) {
            nums1[indexB] = nums2[indexB];
            indexB--;
        }
    }

}
