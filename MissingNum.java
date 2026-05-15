public class MissingNum {
    
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfArr=0;
        for(int i : nums){
          sumOfArr += i;
        }
        int totalSum = n *(n+1)/2;
        int num = totalSum - sumOfArr;
        return num;
    }
    public static void main(String[] args) {
        MissingNum obj = new MissingNum();
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14};
        System.out.println(obj.missingNumber(nums));
    }
}

