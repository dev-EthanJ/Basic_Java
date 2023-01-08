import java.util.Scanner;

public class SuccessOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input yout score.");
        int score = scanner.nextInt();

        if(score >= 80) {
            System.out.println("Congratulation! You got it.");
        }
    }
}