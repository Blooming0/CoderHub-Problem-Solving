public class Main {
    public static void main(String[] args) {
        double []arr1 = {100};
        double []arr2 = {150};
        System.out.println(calculateSacrificeProfit(arr1,arr2));
    }
    public static double calculateSacrificeProfit(double[] buyPrices, double[] sellPrices) {
        double totalBenfits = 0 ;
        for (int i = 0; i < buyPrices.length ; i++) {
            totalBenfits += sellPrices[i]-buyPrices[i] ;
        }
        return totalBenfits;
    }
}