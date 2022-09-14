import java.util.Scanner;

public class Feladat9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i <1001; i++) {
                if (i%3==0&&i%5==0) {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}