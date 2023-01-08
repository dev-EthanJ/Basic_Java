public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
    }

    public void convert() {
        try {
            String korean = "한글";
            byte[] byteArray = korean.getBytes("UTF-8");
            for(byte data: byteArray) {
                System.out.print(data + " ");
            }
            System.out.println();

            String korean2 = new String(byteArray);
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] array) {
        for(byte data: array) {
            System.out.println(data + " ");
        }
        System.out.println();
    }
}