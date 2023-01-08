public class PrimitiveTypes {

    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;

        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);

        byteMax = (byte)(byteMax + 1);
        byteMin = (byte)(byteMin - 1);

        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
    }
    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();

        types.checkByte();
    }
}
