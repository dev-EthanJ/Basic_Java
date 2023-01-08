public class ReferenceDefault {
    public ReferenceDefault(String arg) { System.out.println("String param:" + arg); }
    public ReferenceDefault() { System.out.println("No params."); }

    public static void main(String[] args) {
        ReferenceDefault referenceOne = new ReferenceDefault();
        ReferenceDefault referenceTwo = new ReferenceDefault("arg");
    }
}
