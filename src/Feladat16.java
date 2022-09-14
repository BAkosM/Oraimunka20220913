import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] tomb = new int[5];
            System.out.println("Adjon meg öt db természetes számot!");
            for (int i = 0; i < tomb.length; i++) {
                System.out.print((i + 1) + ": ");
                tomb[i] = sc.nextInt();
            }
            System.out.print("Tömb elemei megadott sorrendben: ");
            for (int i = 0; i < tomb.length; i++) {
                System.out.print(tomb[i] + " ");
            }
            System.out.print("\nTömb elemei fordított sorrendben: ");
            for (int i = tomb.length - 1; i >= 0; i--) {
                System.out.print(tomb[i] + "  ");
            }
            System.out.println("\n\nMinden második elem: ");
            for (int i = 0; i < tomb.length; i++){
                if (i % 2 != 0){
                    System.out.println((i+1) + ": " + tomb[i]);
                }
            }
            System.out.print("\nHanyadik elemet írjam ki: ");
            int index = sc.nextInt();
            System.out.println(index + ". elem: " + (tomb[index-1]));
        }
    }
}