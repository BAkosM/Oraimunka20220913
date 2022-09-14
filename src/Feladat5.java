import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Adjameg a téglalap a oldalát: ");
            double a = sc.nextDouble();
            System.out.println("Adjameg a téglalap b oldalát: ");
            double b = sc.nextDouble();
            System.out.println("Adjameg milyét szeretné a téglalapnak (K:kerület,T:terület): ");
            int i = 0;
            while(i<1){
            String c = sc.next();           
            if (c.equals("k") || c.equals("K")){
                double szam = (a+b)*2;
                System.out.printf("A téglalap kerülete %.0f. ", szam);
                i++;
            } else if (c.equals("t") || c.equals("T")){
                double szam = a*b;
                System.out.printf("A téglalap területe %.0f. ", szam);
                i++;

            }else{
                System.out.printf("Nem megfelelő karakter. Próbáld újra: ");
            }}
            if(a==b){
                System.out.println("Ez egy négyzet!");
            }
        }
    }
}
