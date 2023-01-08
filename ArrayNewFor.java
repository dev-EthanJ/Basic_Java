public class ArrayNewFor {
    public static void main(String[] args) {
        ArrayNewFor array = new ArrayNewFor();
        array.newFor();
    }

    public void newFor() {
        int[] oneDim = new int[] {1, 2, 3, 4};
        for (int data: oneDim) {
            System.out.println(data);
        }

        int[][] twoDim = {{12, 23, 34}, {45, 56}, {67}};
        for (int[] oneData: twoDim) {
            for (int twoData: oneData) {
                System.out.println(twoData);
            }
            System.out.println();
        }
    }
}
