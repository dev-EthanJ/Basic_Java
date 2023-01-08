public class ArrayLength {
    
    public static void main(String[] args) {
        ArrayLength array = new ArrayLength();

        //array.printArrayLength();
        array.printArray();
    }

    public void printArrayLength() {
        int[] oneDim = new int[3];
        int[][] twoDim = new int[4][2];

        System.out.println(oneDim.length);
        System.out.println(twoDim.length);
    }

    public void printArray() {
        int[][] twoDim = {{1, 2, 3}, {4, 5}};

        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println("twoDim[0].length = " + twoDim[0].length);

        /*
        for(int i=0; i<twoDim.length; ++i) {
            for(int j=0; j<twoDim[i].length; ++j) {
                System.out.println("twoDim[" + i + "][" + j + "] = " + twoDim[i][j]);
            }
        }
        */

        int twoDimLen = twoDim.length;
        for(int i=0; i<twoDimLen; ++i) {
            int oneDimLen = twoDim[i].length;
            for(int j=0; j<oneDimLen; ++j) {
                System.out.println("twoDim[" + i + "][" + j + "] = " + twoDim[i][j]);
            } 
        }
    }
}
