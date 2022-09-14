import java.util.Scanner;

public class Feladat10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Adjon meg számokat: ");
            double a = 0;
            double paros = 0;
            double paront = 0;
            while (a < 1000) {
            a = a + sc.nextDouble();
            if (a%2==0){
                paros++;
            } else {
                paront++;
            }
            }
            System.out.printf("A %.0f számból %.0f páros %.0f páratlan.", (paros+paront), paros, paront);
        }
    }
}