public class NumWaterBottles {

    static int numWaterBottles(int numBottles, int numExchange) {
        int totalDrinks = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            totalDrinks += newBottles;
            emptyBottles = emptyBottles % numExchange + newBottles;
        }

        return totalDrinks;
    }
    public static void main(String[] args) {
        System.out.println(numWaterBottles(15, 3));
    }
}
