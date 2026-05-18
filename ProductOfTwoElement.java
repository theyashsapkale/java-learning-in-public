public class ProductOfTwoElement {
   
    static int maxProduct(int[] nums) {
        
        int secLargeElement = -1;
        int largestElement = -1;

        for(int i = 0 ; i < nums.length; i++){

            if(nums[i]>largestElement){
                secLargeElement=largestElement;
                largestElement=nums[i];
            }else if(nums[i]>secLargeElement){
                secLargeElement=nums[i];
            }
            
        }
        int ans = (largestElement-1)*(secLargeElement-1);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        System.out.println(maxProduct(nums));
    }
}

