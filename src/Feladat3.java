import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Adjon meg egy törtet: ");
            double szam = sc.nextDouble();
            double koz;
            if (Math.ceil(szam)-szam>0.5){
                koz = Math.floor(szam);
            }else{
                koz = Math.ceil(szam);
            }
            System.out.printf("A megadott szám a %.0f és a %.0f egész számok között van, és ezek közül a %.0f számhoz van közelebb.", Math.floor(szam),Math.ceil(szam),koz);
            System.out.println();
            System.out.printf("A szám egész része: %.0f", Math.floor(szam));
            System.out.println();
            System.out.printf("A szám törtrésze: %f", (szam-Math.floor(szam)));
        }
    }
}
