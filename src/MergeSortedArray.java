import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] finalArray = new int[m+n];
        System.out.println("Length: " + finalArray.length);
        for (int i = 0; i < m; i++) {
            finalArray[i] = nums1[i];
        }
        System.out.println("Affter one:" + Arrays.toString(finalArray));
        for (int i = 0; i < n; i++){
            finalArray[i+m] = nums2[i];
        }
        System.out.println("Affter Two:" + Arrays.toString(finalArray));
        Arrays.sort(finalArray);
        System.out.println("After Sort:" + Arrays.toString(finalArray));
        for (int i = 0; i < finalArray.length; i++){
            nums1[i] = finalArray[i];
        }
        System.out.println("Num1 :" + Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        // Example to test the merge method
        int[] nums1 = {1,2,5,5,0,0};
        int[] nums2 = {1, 2, 3};

        int m = 3;
        int n = 3;

        // Call the merge method
        merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
