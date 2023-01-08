public class VarTypes {
    int instanceVariable;
    static int classVariable;
    
    public void method(int parameter) {
        int localVariable;
    }

    public void anotherMethod() {
        int localVariable;
    }

    
    public void testMethod() {
        if(true) {
            int locVar;
            if(true) {
                int locVar;
            }
        }
    }
    
    public static void main(String [] args) {
        VarTypes var = new VarTypes();
      //  var.testMethod();
    }
}