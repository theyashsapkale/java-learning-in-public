public class FindDuplicateElement {


    static void twoSum(int arr[], int target){
       for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i]+arr[j] == target) {
                System.out.println("{"+ arr[i]+ " "+arr[j]+"}");
            }
        }
       }
       
      }
    static void findDuplicateEle(int arr[]){
       for (int i = 0; i < arr.length-1; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i]==arr[j]) {
                System.out.println(arr[i]);
            }
        }
       }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,6,4,2};
        // findDuplicateEle(arr);
        int target = 5;
        twoSum(arr, target);
    }

}