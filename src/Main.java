import java.util.Scanner;

public class Main {

    public static void printRange(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        printRange(x, y);
    }
}
