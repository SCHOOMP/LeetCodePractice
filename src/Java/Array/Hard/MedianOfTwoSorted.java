package Java.Array.Hard;

import java.util.Arrays;

public class MedianOfTwoSorted {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] bigArray = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++){
            bigArray[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++){
            bigArray[nums1.length + i] = nums2[i];
        }
        Arrays.sort(bigArray);
        if (isOddLength(bigArray)){
            return bigArray[bigArray.length/2];
        }else{
           return ((double) ((bigArray[(bigArray.length / 2)]) + (bigArray[(bigArray.length / 2) - 1])) / 2);
        }
    }

    public static boolean isOddLength(int[] array) {
        return array.length % 2 != 0;
    }


    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        System.out.println("The Median of the sorted arry is " + findMedianSortedArrays(nums1, nums2));
    }
}
