public class UseStringMethods {


    public static void main(String[] args) {
        UseStringMethods use = new UseStringMethods();
        String stringAPI = "The String class represents character strings.";
        use.printWords(stringAPI);
        use.findString(stringAPI, "string");
        use.countChar(stringAPI, 's');
        use.printContainWords(stringAPI, "ss");
    }

    public void printWords(String str) {
        String[] myStr = str.split(" ");
        for(String splited: myStr) {
            System.out.println(splited);
        }
    }

    public void findString(String str, String findStr) {
        int strIndex = str.indexOf(findStr);
        System.out.println(findStr + " appears at " + strIndex);
    }

    public void findAnyCaseString(String str, String findStr) {
        String newStr = str.toLowerCase();
        findString(newStr, findStr);
    }

    public void countChar(String str, char ch) {
        char[] chArray = str.toCharArray();
        int nCount = 0;
        for(char c: chArray) {
            if (c == ch) ++nCount;
        }

        System.out.println("char '" + ch + "' count is " + nCount);
    }

    public void printContainWords(String str, String findStr) {
        String[] strArray = str.split(" ");
        for(String word: strArray) {
            if (word.indexOf(findStr) > 0) {
                System.out.println(word + " has a '" + findStr + "' in index " + word.indexOf(findStr));
            }
        }
    }
}