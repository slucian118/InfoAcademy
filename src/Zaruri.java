/**
 * Created by lucians on 24/08/15.
 */
/**
 *
 * @author lucians
 */
public class Zaruri {
    public static void main (String [] arg) {
        MulteAruncari();

    }
    public static void MulteAruncari() {
        int nr_aruncari=40;
        int [][] rez=new int[nr_aruncari][];
        for (int i=0;i<nr_aruncari;i++)
        {
            rez[i]=new int[2];
            rez[i][0]=(int)(Math.random()*6+1);
            rez[i][1]=(int)(Math.random()*6+1);
        }
        int duble=0;
        int porti=0;
        for (int i=0;i<nr_aruncari;i++)
        {

            if (rez[i][0]==rez[i][1])
            {
                duble++;
            }
            if ((rez[i][0]-rez[i][1]==2)|(rez[i][1]-rez[i][0]==2))
            {
                porti++;
            }

        }
        System.out.println("Numar aruncari: "+nr_aruncari);
        System.out.println("Numar duble: "+duble);
        System.out.println("Numar porti: " +porti);
        System.out.println("-----------------------------------------");
        System.out.println("STATISTICI: " + duble + " duble, " + porti + " porti in casa");
        System.out.println("Procent duble: " + (int) ((float) duble / rez.length * 100)+"%");
        System.out.println("Procent porti: " + (int) ((float) porti / rez.length * 100)+"%");
    }


    public static void DouaZaruri (){
        int z1=(int)(Math.random()*6+1);
        int z2=(int)(Math.random()*6+1);
        AfiseazaZar(z1);
        AfiseazaZar(z2);
        if (z1==z2) {
            System.out.println("DUBLA");
        }
        if ((z1-z2==2)|(z2-z1==2)){System.out.println("E POARTA IN CASA");}

    }

    public static void UnZar () {
        int z1=(int)(Math.random()*6+1);
        AfiseazaZar(z1);
    }

    public static void AfiseazaZar (int zar) {
        switch (zar){
            case 1:
                System.out.println("unu");
                break;
            case 2:
                System.out.println("doi");
                break;
            case 3:
                System.out.println("trei");
                break;
            case 4:
                System.out.println("patru");
                break;
            case 5:
                System.out.println("cinci");
                break;
            case 6:
                System.out.println("sase");
                break;
        }

    }
}

