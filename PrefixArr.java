
public class PrefixArr {

    public static int[] preF(int arr[]){

        int n = arr.length;

        int temp[]= new int[n];

           temp[0]= arr[0];

        for (int i = 1; i < arr.length; i++) {
           temp[i] = temp[i-1]+arr[i];
        }
        return temp;
    }

     public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int temp[] = preF(arr);

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }

     }
} 
