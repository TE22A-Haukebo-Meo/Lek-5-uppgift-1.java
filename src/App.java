import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] fält1 = {8,4,6,3,9};
        int längd = fält1.length;
        double medel = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4];
        medel = medel/5;
        System.out.println(medel);

        int[] fält2 = {18,14,16,13,19};
        int summa = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4]+fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4];
        System.out.println(summa);
        double medel2 = summa/10;
        System.out.println(medel2);

        int[] summafält = new int [4];
        summafält [0] = fält1[0]+fält2[0];
        summafält [1] = fält1[1]+fält2[1];
        summafält [2] = fält1[2]+fält2[2];
        summafält [3] = fält1[3]+fält2[3];

        Scanner tb = new Scanner(System.in);
        int[] fält3 = new int [4];
        System.out.println("slriv taö");
        fält3[0] = tb.nextInt();
        fält3[1] = tb.nextInt();
        fält3[2] = tb.nextInt();
        fält3[3] = tb.nextInt();
        System.out.println(fält3[0]+fält3[1]+fält3[2]+fält3[3]);
    }
}
