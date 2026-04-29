class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n - i - 1; j++ ){
                if(nums[j+1]< nums[j]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int sum = 0 ;
        for(int i = 0; i < n ; i+=2){
            sum += nums[i];
        }
         return sum ; 
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {1,4,3,2};
        System.out.println(s.arrayPairSum(arr));
    }
}