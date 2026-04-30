public class PlusOne {

    static int[] plusOneMethod(int[] arr){
         
    int n = arr.length;
     for (int i = arr.length-1; i >= 0; i--) {
         if (arr[i]<9) {
            arr[i]++;
             return arr;
          
         }
         arr[i]=0;
     }
    
        int newArr[]= new int[n+1];
        newArr[0] = 1;
        return newArr;
     
    }
public static void main(String[] args) {
      int arr[] = {1,2,9, 9};
        int result[] = plusOneMethod(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
}
}