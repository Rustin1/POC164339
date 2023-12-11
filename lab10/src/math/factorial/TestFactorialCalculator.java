package math.factorial;

public class TestFactorialCalculator {
    public static void main(String[] args) {
        FactorialCalculator f1 = new SimpleFactorialCalculator();
        FactorialCalculator f2 = new SimpleFactorialCalculator();

        System.out.println(f1.calculateFactorial(3));
        System.out.println(f2.calculateFactorial(5));
        System.out.println(f1.isNonNegative(-1));
        System.out.println(f2.isNonNegative(2));
    }
}
