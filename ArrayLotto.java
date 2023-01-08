public class ArrayLotto {

    public void init() {
        int [] lottoNumbers = new int[7];
        for (int i = 0; i < 7; ++i) {
            lottoNumbers[i] = i;
        }
    }

    public static void main(String[] args) {
        ArrayLotto array = new ArrayLotto();
        array.init();
    }
}
