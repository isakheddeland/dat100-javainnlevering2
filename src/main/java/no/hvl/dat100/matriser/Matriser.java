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



}
