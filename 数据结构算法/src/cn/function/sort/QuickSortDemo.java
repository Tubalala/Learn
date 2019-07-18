package cn.function.sort;

public class QuickSortDemo {
     private static int[] quickSort(int[] nums, int star, int end){
        if (star > end) {
            return null;
        }
        int i = star;
        int j = end;
        int key = nums[star];
        while (i < j) {
            while (i<j && nums[j] > key){
                j--;
            }
            while (i<j && nums[i] <= key){
                i++;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int temp = nums[i];
        nums[i] = nums[star];
        nums[star] = temp;
        quickSort(nums,star,i-1);
        quickSort(nums,i+1,end);
        return nums;

    }
}
