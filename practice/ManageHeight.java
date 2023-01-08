public class ManageHeight {
    int[][] gradeHeight;

    public static void main(String[] args) {
        ManageHeight manage = new ManageHeight();
        manage.setData();
        
        for(int classNo = 1; classNo <= 5; ++classNo) {
            manage.printHeight(classNo);
            manage.printAverage(classNo);
        }
    }

    public void setData() {
        gradeHeight = new int[5][];

        gradeHeight[0] = new int[]{170, 180, 173, 175, 177};
        gradeHeight[1] = new int[]{160, 165, 167, 186};
        gradeHeight[2] = new int[]{158, 177, 187, 176};
        gradeHeight[3] = new int[]{173, 182, 181};
        gradeHeight[4] = new int[]{170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:" + classNo);
        
        classNo--;
        for(int height: gradeHeight[classNo]) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        double sum = 0;
        classNo--;
        
        for(int height: gradeHeight[classNo]) {
            sum += height;
        }
        
        int nStudent = gradeHeight[classNo].length;
        double average = sum / nStudent;
        
        System.out.println("Height average:" + average);
    }
}
