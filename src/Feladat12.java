import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Adjon meg egy forint öszzeget 1000 forintig: ");
            double ft = sc.nextDouble();
            int ketszaz = 0;
            int szaz = 0;
            int otven = 0;
            int huszas = 0;
            int tizes = 0;
            int otos = 0;
            while (ft>5) {
                if (ft>=200){
                    ketszaz++;
                    ft-=200;
                } else if (ft>=100){
                    szaz++;
                    ft-=100;
                } else if (ft>=50){
                    otven++;
                    ft-=50;
                } else if (ft>=20){
                    huszas++;
                    ft-=20;
                } else if (ft>=10){
                    tizes++;
                    ft-=10;
                } else if (ft>=5){
                    otos++;
                    ft-=5;
                }
            }
            System.out.printf("Ezt az összeget a lehető legkevesebb érmével úgy lehet felosztani, ha %d kétszázast %d százast %d ötvenest %d huszast %d tizest %d ötöst használunk %.0f maradékkal", ketszaz,szaz,otven,huszas,tizes,otos,ft);
        }
    }
}