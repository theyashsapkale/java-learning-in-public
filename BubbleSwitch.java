public class BubbleSwitch {
    
    static int bubbleSwitch(int n){
        int count = 0;
        int i = 1;
        while(i*i<=n){
            count++;
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(bubbleSwitch(15));
    }
}