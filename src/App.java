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
    }
}
