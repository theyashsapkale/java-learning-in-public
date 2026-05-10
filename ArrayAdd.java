import java.util.Arrays;

public class ArrayAdd {

    public static void arrayAdding(int arr1[], int arr2[]){
     int j = arr2.length-1;
        for (int i = arr1.length-1; i >= 0 && j>= 0; i--) {
            if (arr1[i]==0) {
                arr1[i]=arr2[j];
                j--;
            }else{
                arr1[i]= arr1[i];
            }
        }
        Arrays.sort(arr1);

        for (int i : arr1) {
            System.out.println(i);
        }
    }
     public static void main(String[] args) {
        int arr1[]={1,2,3,4,0,0,0};
        int arr2[]={2,5,6};

        arrayAdding(arr1,arr2);
     }
}