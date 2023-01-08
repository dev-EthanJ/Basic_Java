import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and end with -1.");

        int n = scanner.nextInt();
        while(n != -1) {
            sum += n;
            ++count;
            n = scanner.nextInt();
        }

        if(count == 0) { System.out.println("There is no input."); }
        else {
            System.out.println("Total number of integer is " + count + ", and average is " + (double)sum / count);
        }
    } 
}