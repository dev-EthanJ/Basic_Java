
public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.printDivide(1, 2);
        calc.printDivide(1, 0);
    }

    public void printDivide(double a, double b) {
        try {
            if(b == 0.0) { throw new Exception("Second value can't be Zero"); }
            double result = a / b;
            System.out.println("result = " + result);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
