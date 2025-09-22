package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
        }
        System.out.println();
    }


    // b)
    public static String tilStreng(int[] tabell) {
        String streng = "[";

        for (int i = 0; i < tabell.length; i++) {
            streng += tabell[i];
            if (i < tabell.length - 1) {
                streng += ",";
            }
        }
        streng += "]";

        System.out.println();
        return streng;
    }

    // c)
    public static int summer(int[] tabell) {

        int sum = 0;

        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        System.out.println("summen av tabellen er: " + sum);


        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        boolean finnes = false;


        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                finnes = true;
                break;
            }

        }
        if (!finnes) {
            System.out.println("Tallet er ikke i tabellen");

        }
        System.out.println();
        return finnes;
    }


    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        int n = -1;

        for(int i = 0; i < tabell.length; i++) {
            if(tall == tabell[i]){
                return i;

            }
        }return n;
    }

    // f)
    public static int[] reverser(int[] tabell) {

        int[] reverser = new int[tabell.length];

        for  (int i = 0; i < tabell.length; i++) {
            reverser[i] = tabell[tabell.length - i - 1];
        }
        return reverser;
    }

    // g)
    public static boolean erSortert(int[] tabell) {

        for (int i = 0; i < tabell.length-1; i++) {
            if (tabell[i] > tabell[i+1]) {
                return false;

            }
        }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] sammen = new int[tabell1.length + tabell2.length];

        int idx = 0;
        for (int tabb : tabell1) {
            sammen[idx++] = tabb;
        }
        for (int tabb : tabell2) {
            sammen[idx++] = tabb;
        }

        for (int tabb : sammen) {

        }
        System.out.println();
        return sammen;


    }

    public static void main(String[] args) {

        //a
        int[] tabellA = {1, 2, 3, 4, 5};
        skrivUt(tabellA);

        //b
        int[] tabellB = {42, 67, 89};
        String resultatB = tilStreng(tabellB);
        System.out.println(resultatB);

        //c
        int[] tabellC = {9, 20, 1, 12, 6};
        summer(tabellC);

        //d
        int[] tabellD = {1, 2, 3, 4, 5, 6, 7};
        boolean resultatA = finnesTall(tabellD, 4); //tester
        System.out.println(resultatA);
        System.out.println();

        //e
        int[] tabellE = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(posisjonTall(tabellE, 60));
        System.out.println();

        //f
        int[] tabellF1 = {1, 2, 3, 4, 5, 6, 7};
        int[] tabellF2 = reverser(tabellF1);
        System.out.println(tabellF2);

        //g
        int[] tabellG = {1, 2, 3, 4, 5, 6, 7};  //tester
        System.out.println(erSortert(tabellG));


        //h
        int[] tabellH1 = {1, 2, 3};
        int[] tabellH2 = {4, 5, 6};

        int[] resultatH = settSammen(tabellH1, tabellH2);

        for (int i = 0; i < resultatH.length; i++) {
            System.out.print(resultatH[i] + " ");
        }
        System.out.println();
        System.out.println("Lengden av tabellen: " + resultatH.length);


    }
}
