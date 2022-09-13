import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a medence átmérőjét méterben: ");
        double atmero = sc.nextDouble();
        System.out.println("Adja meg a medence mélységét méterben: ");
        double melyseg = sc.nextDouble();
        double sugar = atmero / 2;
        double alap = sugar * sugar * Math.PI;
        double terfogat = alap * melyseg;
        System.out.printf("A medence térfogata %.3f m2.", terfogat);
    }
}
