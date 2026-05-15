class Stock {

    static void StockMarket(int stock[]) {

        int minPrice = stock[0];
        int maxProfit = 0;

        for (int i = 1; i < stock.length; i++) {

            if (stock[i] < minPrice) {
                minPrice = stock[i];
            }

            int profit = stock[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit = " + maxProfit);
    }

    public static void main(String[] args) {

        int stock[] = {7,1,5,3,6,4};

        StockMarket(stock);
    }
}