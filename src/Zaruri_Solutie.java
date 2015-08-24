/**
 * Created by lucians on 24/08/15.
 */

public class Zaruri_Solutie {

    public static void main(String[] args) {

        int nrIncercari = 20;
        int[][] aruncari = new int[nrIncercari][2];
        for (int i = 0; i < nrIncercari; i++) {
            aruncari[i][0] = (int) (Math.random() * 6) + 1;
            aruncari[i][1] = (int) (Math.random() * 6) + 1;
        }
        statistica(aruncari);
    }

    public static void afisareZar(int z) {
        switch (z) {
            case 1:
                System.out.println("Ati dat: UNU");
                System.out.println("   ");
                System.out.println(" * ");
                System.out.println("   ");
                break;
            case 2:
                System.out.println("Ati dat: DOI");
                System.out.println("*  ");
                System.out.println("   ");
                System.out.println("  *");
                break;
            case 3:
                System.out.println("Ati dat: TREI");
                System.out.println("*  ");
                System.out.println(" * ");
                System.out.println("  *");
                break;
            case 4:
                System.out.println("Ati dat: PATRU");
                System.out.println("* *");
                System.out.println("   ");
                System.out.println("* *");
                break;
            case 5:
                System.out.println("Ati dat: CINCI");
                System.out.println("* *");
                System.out.println(" * ");
                System.out.println("* *");
                break;
            case 6:
                System.out.println("Ati dat: SASE");
                System.out.println("* *");
                System.out.println("* *");
                System.out.println("* *");
                break;
        }
        System.out.println();
    }

    private static void statistica(int[][] aruncari) {
        int nrPorti = 0, nrDuble = 0;
        for (int i = 0; i < aruncari.length; i++) {
            int[] a = aruncari[i];
            afisareZar(a[0]);
            afisareZar(a[1]);
            // afisareInParalel(a[0],a[1]);
            switch (a[0] - a[1]) {
                case 0:
                    System.out.println("Dubla!");
                    nrDuble++;
                    break;
                case 2:
                case -2:
                    System.out.println("Poarta-n casa!");
                    nrPorti++;
                    break;
            }

        }
        System.out.println("-----------------------------------------");
        System.out.println("STATISTICI: " + nrDuble + " duble, " + nrPorti + " porti in casa");
        System.out.println("Procent duble: " + (int) ((float) nrDuble / aruncari.length * 100));
        System.out.println("Procent porti: " + (int) ((float) nrPorti / aruncari.length * 100));
    }
    // valori si linii numerotate de la 1
    public static String linieZar(int valoareZar, int linie){
        String[][] feteZar = {
                {	"   ",
                        " * ",
                        "   "
                },
                {	"*  ",
                        "   ",
                        "  *"
                },
                {	"*  ",
                        " * ",
                        "  *"
                },
                {	"* *",
                        "   ",
                        "* *"
                },
                {	"* *",
                        " * ",
                        "* *"
                },
                {	"* *",
                        "* *",
                        "* *"
                }
        };
        return feteZar[valoareZar-1][linie-1];
    }

    public static void afisareInParalel(int z1, int z2){
        for(int i=1;i<=3;i++){
            System.out.print(linieZar(z1,i));
            System.out.print("\t");
            System.out.println(linieZar(z2,i));
        }

    }

    public static void afisareZarInLitere(int z){
        System.out.println(new String[]{"unu","doi","trei","patru","cinci","sase"}[z-1]);

//	int[] i={1,2,3};
//	int[] j;
//	j = {4,5,6}; --> NU MERGE!
//	j = new int[]{1,2,3};

    }

}