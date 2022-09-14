import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Hányadik hónapot írjuk: ");
            double ho = sc.nextDouble();         
            if (ho>2&&ho<6){
                System.out.printf("Tavasz!");
            } else if (ho>5&&ho<9){
                System.out.printf("Nyár!");
            } else if (ho>8&&ho<12){
                System.out.printf("Ősz!");
            } else if (ho==12||ho<3&&ho>0){
                System.out.printf("Tél!");
            } else {
                System.out.printf("Ilyen hónap nincs!");
            }
        }
    }
}
