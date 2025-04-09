public class FindNegetiveElement {
    // using for-each loop
    static void FindNegetive(int arr[][]){
        for (int[] rows : arr) {
            for (int cal : rows) {
                if (cal < 0) {
                    System.out.print(cal+" ");
                }
            }
        }
        System.out.println();
    }

    static void ForLoop2(int arr1[]){
        
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i]==arr1[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
    // using for loop
       static void FindNegUsingForLoop(int arr[][]){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j]<0) {
                       System.out.print(arr[i][j]+" "); 
                    }
                }
            }
            System.out.println();
    }
    // using while loop
    static void FindNegUsingWhileLoop(int arr[][]){
         int i=0;
         while (i<arr.length) {
             int j=0;
            while (j<arr[i].length) {
                 if (arr[i][j]<0) {
                    System.out.print(arr[i][j]+" ");
                }
                j++;
            }
            i++;
         }
         System.out.println();
    }
    static void StockMarket(int stock[]){
     
      int profit=0;
       for (int i = 1; i < stock.length; i++) {
        if (stock[i]>stock[i-1]) {
            profit += stock[i]-stock[i-1];
            System.out.println("buy at "+stock[i-1]+" sell at "+stock[i]);}
            else{System.out.println("none");}
        }
        System.out.println("profit is "+profit);
    }
     public static void main(String[] args) {
        int stock[]={5,1011,15,202,25,300};
        int arr1[]={1,2,3,4,5,6,7,1,2,3,4,5,6,7};
        int arr[][]=
        {
        {1,2,3,-4,5},
        {1,2,3,4,-6},
        {2,3,1,-5,6}
        };
        StockMarket(stock);
        ForLoop2(arr1);
        FindNegetive(arr);
        FindNegUsingForLoop(arr);
       FindNegUsingWhileLoop(arr);
                }
             }