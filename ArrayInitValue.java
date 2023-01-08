public class ArrayInitValue {

    public static void main(String[] args) {
        ArrayInitValue array = new ArrayInitValue();
        array.referenceTypes();
    }   
    
    public void referenceTypes() {
        String[] strings = new String[2];
        ArrayInitValue[] array = new ArrayInitValue[2];
        System.out.println("default string=" + strings[1]);
        System.out.println("default reference type=" + array[1]);
    }
}
