
public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
        try {
            sample.throwException(13);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main() exit");
    }

    public void throwException(int number) throws Exception{
        try {
            if(number > 12) {
                throw new Exception("Number is over than 12.");
            }
        } catch (Exception e) {
            throw new Exception("Number is " + number);
        }
    }
}