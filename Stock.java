public class Stock {
    static void StockMarket(int stock[]){
        int profit=0;
         for (int i = 1; i < stock.length; i++) {
          if (stock[i]>stock[i-1]) {
              profit += stock[i]-stock[i-1];
              System.out.println("buy at "+stock[i-1]+" sell at "+stock[i]);}
            }
          System.out.println("profit is "+profit);
      }
      public static void main(String[] args) {
        int stock[]={5,1011,15,202,25,300};
          StockMarket(stock);
      }
}
