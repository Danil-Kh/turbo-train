

public class ATM {


    public int countBanknotes(int sum){

        int count = 0;
        while (sum > 0){

            if (sum - 500 >= 500 || sum - 500 >= 0){
                sum -= 500;
                count++;
            }
            else if (sum - 200 >= 200 || sum - 200 >= 0)
            {
                sum -= 200;
                count++;

            }
            else if (sum - 100 >= 100 || sum - 100 >= 0)
            {
                sum -= 100;
                count++;

            }
            else if (sum - 50 >= 50 || sum - 50 >= 0)
            {
                sum -= 50;
                count++;

            }
            else if (sum - 20 >= 20 || sum - 20 >= 0)
            {
                sum -= 20;
                count++;

            }
            else if (sum - 10 >= 10 || sum - 10 >= 0)
            {
                sum -= 10;
                count++;

            }
            else if (sum - 5 >= 5 || sum - 5 >= 0)
            {
                sum -= 5;
                count++;

            }
            else if (sum - 2 >= 2 || sum - 2 >= 0)
            {
                sum -= 2;
                count++;

            }
            else if (sum - 1 >= 1 || sum - 1 >= 0)
            {
                sum -= 1;
                count++;

            }




        }
        return count;

    }

    public static void main(String[] args) {

        ATM atm = new ATM();
       // System.out.println(atm.countBanknotes((578)));


        int cellFirstYher = (int) ((500000 * 0.8 * 0.09 * 0.1 * 0.1));
        int tset = (int) ((500000 * 0.09));
       System.out.println(cellFirstYher);
        System.out.println(tset);









    }
}
