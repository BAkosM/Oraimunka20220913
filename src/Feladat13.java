import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double x = Math.round(Math.random()*100+1);
            double tip = 0;
            while(tip!=x){
                System.out.println("Add meg a tipped: ");
                tip = sc.nextDouble();
                if(tip<x){
                    System.out.println("Kissebb");
                } else if (tip>x){
                    System.out.println("Nagyobb");
                } else {
                    System.out.println("Nyerés van!");
                }
            }
        }
    }
}
