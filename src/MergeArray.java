public class MergeArray {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        int copyInd = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] <= nums2[j]){
                nums1[copyInd] = nums2[j--];
            }
            else nums1[copyInd] = nums1[i--];
            copyInd--;
        }
        while(j >= 0) {
            nums1[copyInd] = nums2[j--];
            copyInd--;
        }
    }
}
