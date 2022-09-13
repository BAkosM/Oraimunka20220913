import java.util.Scanner;
import static java.lang.System.*;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Adjon meg egy szöveget: ");
        String szoveg = sc.next();
        out.println("Válaszon az alábbi funkciók közül:");
        out.println("a(Nagy betűssé alakítani)\n" +
                "b(Kisbetűssé alakítani)\n" +
                "c(Lekérdezni a hosszát)\n" +
                "d(Összehasonlítani egy másik szöveget)\n" +
                "e(Egy részét kiiratni a Szövegnek (a, b intervallum bekérése))\n" +
                "f(Kilépés)");
        String opc = "";
        while (opc != "f"){
            out.println("Választott opció: ");
            opc = sc.next();
        }
    }
}
