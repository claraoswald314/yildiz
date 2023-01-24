import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {

            for (int j = i; j < N - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            if (i > 0) {
                for (int j = 1; j < i + 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < N - 1; j++) {
                System.out.print("*");
            }
            for (int j = i; j < N - 2; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
