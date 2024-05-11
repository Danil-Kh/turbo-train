import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrurlBank {

    public int sumQuads(int n){
        int sum = 0;
        while (n > 0){


            sum += (int) Math.pow(n,2);

            n--;
        }
        return sum;
    }
    public int countSumOfDigits(int number){

        int temp = number;
        int i = 0;
        int suma = 0;
        List<Integer> digits = new ArrayList<>();
        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
            i++;
        }

        while (i > 0) {
            suma += digits.get(i - 1);
            i--;
        }
        return suma;




    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        System.out.println( bank.countSumOfDigits(4334));

        //Should be 14 - 1 + 4 + 9

    }
}