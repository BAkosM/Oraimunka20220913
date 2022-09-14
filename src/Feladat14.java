import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Adjon meg egy szöveget: ");
            String szoveg = sc.next();
            System.out.print("Mit szeretne csinálni a szöveggel?\n a (Nagybetűssé alakítani)\n b (Kisbetűssé alakítani)\n c (Lekérdezni a hosszát)\n d (Összehasonlítani egy másik szöveggel)\n e (Egy részét kiiratni a szövegnek (a és b intervallum megadásával))\n f (Kilépni)");
            System.out.print("Válasz: ");
            String valasz = sc.next();
            while (valasz != "f") {
                if (valasz.equals("a")) {
                    String nagy = szoveg.toUpperCase();
                    System.out.printf("Nagybetűs szöveg: %s", nagy);
                } else if (valasz.equals("b")) {
                    String kicsi = szoveg.toLowerCase();
                    System.out.printf("Kisbetűs szöveg: %s", kicsi);
                } else if (valasz.equals("c")) {
                    int hossz = szoveg.length();
                    System.out.printf("Szöveg hossza: %d", hossz);
                } else if (valasz.equals("d")) {
                    System.out.print("Adja meg a másik szót: ");
                    int elso = szoveg.length();
                    String masodikszoveg = sc.next();
                    int masodik = masodikszoveg.length();
                    if (elso > masodik){
                        int kulombseg = elso - masodik;
                        System.out.printf("%s hosszabb mint a/az %s ennyivel: %d\n",szoveg,masodikszoveg,kulombseg);
                    } else if (masodik > elso) {
                        int kulombseg = masodik - elso;
                        System.out.printf("%s hosszabb mint a/az %s ennyivel: %d\n",masodikszoveg,szoveg,kulombseg);
                    }else {
                        System.out.printf("Ugyan olyan hosszúak. Hosszúságuk: %d\n",elso);
                    }
                } else if (valasz.equals("e")) {
                    System.out.print("Adja meg az intervallum első számát: ");
                    int a = sc.nextInt();
                    System.out.print("Adja meg az intervallum második számát: ");
                    int b = sc.nextInt();
                    String bontott = szoveg.substring(a, b);
                    System.out.printf("A bontott szöveg: %s", bontott);
                } else if (valasz.equals("f")) {
                    System.out.println("Kilépés...");
                    break;
                } else {
                    System.out.print("Csak a-f betűket írjon\nVálasz: ");
                }
                System.out.print("\nMi egyebet szeretne csinálni: ");
                valasz = sc.next();
            }
        }
    }
}