class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 298));
    }
}


class FirNum {
    public int calc(int n) {
        return n;
    }
}


class FirNumSum extends FirNum{
    @Override
    public int calc(int n) {
        int finalsum = 0;
        if (n == 1)
            return 1;

        for (int i = 0; i <= n; i++){
            finalsum += i;
        }
        return finalsum;

    }
}
class FirNumFactorial extends FirNum{
    @Override
    public int calc(int n) {
        int finalsum = 1;
        if (n == 0)
            return 1;

        for (int i = 1; i <= n; i++){
            finalsum *= i;

        }
        return finalsum;
    }
}
class FirNumMultiplyOdd extends  FirNum{
    @Override
    public int calc(int n) {
        int finalsum = 1;
        for (int i = 1; i <= n; i += 2){
            finalsum *= i;

        }
        return finalsum;
    }
}
class FirNumFizzBuzz extends FirNum{
    @Override
    public int calc(int n) {
        int finalsum = 0;
        for (int i = 0; i <= n; i++){

            if((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)){

                finalsum += i;

            }
        }
        return finalsum;
    }
}
class FirNumBasis extends FirNum{
    @Override

    public int calc(int n) {
        int finalsum = 0;
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0){
                finalsum += i;
            }

        }

        return finalsum / 2;


    }
}