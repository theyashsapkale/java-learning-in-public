 public class IsGoodQue {

    public boolean isGood(int[] nums) {

        int n = nums.length - 1;

       
        for (int i = 1; i <= n; i++) {

            int count = 0;

           
            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == i) {
                    count++;
                }
            }

            
            if (i == n) {

                if (count != 2) {
                    return false;
                }
            }

            
            else {

                if (count != 1) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        IsGoodQue obj = new IsGoodQue();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(obj.isGood(nums));
    }
}