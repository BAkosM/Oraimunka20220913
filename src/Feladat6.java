import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Elért pontszám: ");
            double pont = sc.nextDouble();        
            if (pont<43){
                System.out.printf("Elégtelen");
            } else if (pont<58){
                System.out.printf("Elégséges");
            } else if (pont<73){
                System.out.printf("Közepes");
            } else if (pont<88){
                System.out.printf("Jó");
            } else if (pont<101){
                System.out.printf("Jeles");
            } else {
                System.out.printf("Csaló");
            }
        }
    }
}
