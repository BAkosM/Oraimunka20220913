import java.util.Scanner;

public class Feladat15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] tomb = new double[25];
            for (int i = 0; i < tomb.length; i++) {
                tomb[i] = Math.round(Math.random()*100);
            }
            for (int i = 1; i < tomb.length; i+=2) {
                System.out.print(Math.round(tomb[i]*tomb[i])+" ");
            }
        }
    }
}
