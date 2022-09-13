import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Adja meg a fal szélességét méterben: ");
            double szel = sc.nextDouble();
            System.out.println("Adja meg a fal magasságát méterben: ");
            double mag = sc.nextDouble();
            double terulet = (szel*mag)*1.1;
            double szam = Math.ceil(terulet/0.04);
            System.out.printf("A falhoz szüksséges csempék száma %.0f db.", szam);
        }
    }
}