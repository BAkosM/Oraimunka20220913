import java.util.concurrent.ThreadLocalRandom;

public class Feladat17 {
    public static void main(String[] args) {
        int low = -100;
        int high = 100;
        double[] tomb = new double[10];
        double[] tomb2 = new double[10];
        double[] tomb3 = new double[10];
        for (int i = 0; i < 10; i++){
            tomb[i] = ThreadLocalRandom.current().nextDouble(low, high + 1);
            tomb2[i] = ThreadLocalRandom.current().nextDouble(low, high + 1);
            System.out.printf("%d. szám: %f + %f = %f\n",(i+1),tomb[i],tomb2[i],(tomb[i]+tomb2[i]));
            tomb3[i] = tomb[i]+tomb2[i];
        }
        System.out.println("\nÖsszegek hozzáadva a 3-ik tömbhöz!");
    }
}