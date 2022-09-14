import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Adj meg egy pozitív egész számot: ");
            int a = sc.nextInt();
            double osz = 0;
            for (int i = 1; i < a; i+=2) {
                osz = osz + i;
            }
            System.out.printf("A számok összege: %.0f",osz);
        }
    }
}