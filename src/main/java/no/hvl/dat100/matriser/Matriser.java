package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

        for(int i = 0; i < matrise.length; i++){
            for(int p = 0; p < matrise[i].length; p++){
                System.out.print(matrise[i][p] + " ");
            }
            System.out.println();
        }

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder sb = new StringBuilder();

        for(int i = 0; i < matrise.length; i++){
            for(int p = 0; p < matrise[i].length; p++){
                sb.append(matrise[i][p]).append(" ");
            }
            sb.append("\n");

        }
        System.out.println();
        return sb.toString();

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int[][] nyMatrise = new int[matrise.length][matrise[0].length];

        for(int i = 0; i < matrise.length; i++) {
            for (int p = 0; p < matrise[i].length; p++) {
                nyMatrise[i][p] = matrise[i][p] * tall;
            }
        }
        System.out.println();

	    return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

        if (a.length != b.length) {
            return false;
        }
        System.out.println();

        for(int i = 0; i < a.length; i++) {
            if(a[i].length != b[i].length){
                return false;
                }
            }

        for (int i = 0; i < a.length; i++) {
            for (int p = 0; p < a[i].length; p++){
                if(a[i][p] != b[i][p]){
                    return false;
                }
            }
        }

        return true;

	}


    public static void main(String[] args){

       //a
        int[][] tabellA = {
                {1,2,3},
                {2,3,4},
                {3,4,5},
        };
        skrivUt(tabellA);

        //b
        int[][] tabellB = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        String resultat = tilStreng(tabellB);
        System.out.print(resultat);
        System.out.println();


        //c
        int[][] tabellC = {
                {1, 2, 3},
                {4, 5, 6},
        };
        System.out.println();

        System.out.println("Original tabell: ");
        for(int i = 0; i < tabellC.length; i++){
            for(int p = 0; p < tabellC[i].length; p++){
                System.out.print(tabellC[i][p] + " ");
            }
            System.out.println();
        }

        int[][] skalert = skaler(2,tabellC);
        System.out.println("Tabell ganget med 2: ");
        for(int i = 0; i < skalert.length; i++){

            for(int p = 0; p < skalert[i].length; p++){
                System.out.print(skalert[i][p] + " ");
            }
            System.out.println();
        }


        //d
        int[][] tabellD1 = {
                {1, 2, 3},
                {4, 5, 6},
        };
        int[][] tabellD2 = {
                {4, 5, 6},
                {7, 8, 9},
        };

        System.out.println(erLik(tabellD1, tabellD2));


    }
}
