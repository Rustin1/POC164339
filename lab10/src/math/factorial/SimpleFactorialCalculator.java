package math.factorial;

public class SimpleFactorialCalculator implements FactorialCalculator{
    @Override
    public int calculateFactorial(int number) {
        int i = 1;
        int fact = 1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }

    @Override
    public boolean isNonNegative(Integer number) {
        if (number != null)
            if (number<=0) {
                return false;
            }
            return true;

    }
}
