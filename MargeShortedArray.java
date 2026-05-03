class MergeSortedArray {
    // public static void merge(int[] nums1, int m, int[] nums2, int n) {

    // int i = m - 1;
    // int j = n - 1;
    // int k = m + n - 1;

    // while (i >= 0 && j >= 0) {
    // if (nums1[i] > nums2[j]) {
    // nums1[k] = nums1[i];
    // i--;
    // } else {
    // nums1[k] = nums2[j];
    // j--;
    // }
    // k--;
    // }

    // while (j >= 0) {
    // nums1[k] = nums2[j];
    // j--;
    // k--;
    // }
    // }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Length = nums1.length - 1;
        m = m - 1;
        n = n - 1;

        while (nums1Length >= 0 && m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[nums1Length] = nums1[m];
                m -= 1;
            } else {
                nums1[nums1Length] = nums2[n];
                n -= 1;
            }

            nums1Length -= 1;
        }

        while (m >= 0)

        {
            nums1[nums1Length] = nums1[m];
            m -= 1;
            nums1Length -= 1;
        }

        while (n >= 0) {
            nums1[nums1Length] = nums2[n];
            n -= 1;
            nums1Length -= 1;
        }

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 4, 0, 0, 0 };
        int m = 3;
        int nums2[] = { 2, 8, 6 };
        int n = 3;

        merge(nums1, m, nums2, n);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}