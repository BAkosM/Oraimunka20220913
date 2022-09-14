import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Adjameg a háromszög a oldalát: ");
            double a = sc.nextDouble();
            System.out.println("Adjameg a háromszög b oldalát: ");
            double b = sc.nextDouble();
            System.out.println("Adjameg a háromszög c oldalát: ");
            double c = sc.nextDouble();
            if(a<b+c && b<a+c && c<b+a){
                Double k = a+b+c;
                System.out.printf("A háromszög kerülete: %.0f", k);
            }else{
                System.out.println("Ez nem egy háromszög!");
            }
        }
    }
}
