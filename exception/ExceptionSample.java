
public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        //sample.arrayOutOfBounds();
        //sample.arrayOutOfBoundsTryCatch();
        sample.MultiCatch();
    }

    public void arrayOutOfBounds() {
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }

    public void arrayOutOfBoundsTryCatch() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[10]);
            System.out.println("This code is running.");
        } catch(Exception e) {
            System.out.println("Catch exception!");
        }    
    }

    public void MultiCatch() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (NullPointerException e) {
            System.out.println("NullPorinterException occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        } catch (Exception e) {
            System.out.println("Exception occurs");
        }
    }
}