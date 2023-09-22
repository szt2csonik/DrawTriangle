import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the triangle height: ");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            a++;
            System.out.println("");
        }
    }
}
