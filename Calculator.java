public class Calculator {
  public static void main(String [] args) {
    System.out.println("this is calculator");

    int a = 4;
    int b = 10;

    Calculator calc = new Calculator();
    
    calc.myprint("add", calc.add(10, 23));
    calc.myprint("add", calc.add(a, b));
    calc.myprint("subtract", calc.subtract(a, b));
    calc.myprint("divide", calc.divide(a, b));
    calc.myprint("multiply", calc.multiply(a, b));
  }

  public void myprint(String func, int result) {
    System.out.println(func + '=' + result);
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int divide(int a, int b) {
    return a / b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }
}