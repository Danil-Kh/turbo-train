import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }
    public void multiplyPrices(float[] prices){

        for (int i = 0; i < prices.length; i++){

            if(prices[i] < 1000){
                float a = prices[i] * 2;
               prices[i] = a;
            }
            else if(prices[i] >= 1000){
                prices[i] = (float) (prices[i] * 1.5);
            }

        }
    }
    public int[] findMinMaxPrices(int[] prices){
        if (prices.length == 0){
            return new int[]{};
        }
        else {
            int max = prices[0];
            int min = prices[0];
            for(int i = 0; i < prices.length; i++){
                if (max < prices[i]){
                    max = prices[i];
                }
                if (min > prices[i]){
                    min = prices[i];
                }
            }
            if (min == max){
                return new int[]{min};
            }

            return new int[]{min,max};
        }
    }
    public int getMinPriceCount(int[] prices){
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int h = 0;
        for(int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }
        }
        for(int i = 0; i < prices.length; i++) {

            if (prices[i] == min){
                h++;
            }
        }
            return h;
    }
    public int[] removePrice(int[] prices, int toRemove){
        int mass = 0;

        for(int i = 0; i < prices.length; i++) {

            if (prices[i] == toRemove){
                mass++;

            }
        }
        int[] delateMass = new int[prices.length - mass];
        for(int i = 0, j = 0; i < prices.length; i++) {

            if (prices[i] != toRemove){

                delateMass[j++] = prices[i];

            }
        }

        return delateMass;

    }
    public int[] leavePrice9(int[] prices){

        if (prices.length == 0)
            return new int[]{};;

        int mass = 0;
        for(int i = 0; i < prices.length; i++) {

            if (prices[i] % 10 == 9){
                mass++;
            }
        }
        int finbal = prices.length - mass;
        int[] delateMass = new int[prices.length - finbal];
        for(int i = 0, j = 0; i < prices.length; i++) {

            if (prices[i] % 10 == 9) {
                delateMass[j++] = prices[i];
            }
        }
        return delateMass;
    }
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){
        if (showcaseStocks.length == 0 && warehouseStocks.length == 0)
        {
            return new String[0];

        }

        String[] massUltamass = new String[showcaseStocks.length + warehouseStocks.length];

     System.arraycopy(showcaseStocks,0,massUltamass,0,showcaseStocks.length);

     System.arraycopy(warehouseStocks,0,massUltamass,showcaseStocks.length,warehouseStocks.length);


        return massUltamass;
    }
    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int cummCorectly = 0;
        for (int  i = 0; i < prices.length; i++){

            if (prices[i] >= minPrice && prices[i] <= maxPrice){
                cummCorectly += prices[i];
            }
        }
        return cummCorectly;

    }






    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));









    }
}