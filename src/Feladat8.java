import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Fej(0) vagy írás(1): ");
            double e = sc.nextDouble();
            double rnd = Math.round(Math.random());
            if (rnd == e){
                System.out.println("Nyertél!");
            } else {
                System.out.println("Nem nyerés van. Próbáld újra!");
            }
        }
    }
}
