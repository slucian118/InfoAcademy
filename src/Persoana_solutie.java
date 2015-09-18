/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicatie;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author instructor
 */
public class Persoana_solutie {

    private String nume;
    private int an, luna, zi;

    public Persoana_solutie(String n, int a, int l, int z) {
        setFields(n,a,l,z);
    }

    private void setFields(String n, int a, int l, int z){
        nume = n;
        an = a;
        luna = l;
        zi = z;
    }

    public Persoana_solutie(String n, Calendar c) {
        this(n, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        // alternativ: setFields(n, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        // alternativ 2: this(n, c.getTime());
    }

    public Persoana_solutie(String n, Date d) {
        Calendar c = new GregorianCalendar();
        c.setTime(d);
        setFields(n, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
    }

    public String getDataNasterii() {
        String[] luni = {"ianuarie", "februarie"};
        return zi + " " + luni[luna] + " " + an;
    }

    public Calendar getDataNasteriiCalendar() {
        return new GregorianCalendar(an, luna, zi);
    }

    public Date getDataNasteriiDate() {
        return getDataNasteriiCalendar().getTime();
    }


    public static int zilePerLuna(int l, int a) {
        switch (l) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                return 31;
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;
            case 1:
                return (a % 4 == 0 ? 29 : 28);
            default:
                return -1;
        }
    }

    public boolean validareData(int a, int l, int z) {
        if (a < 0 || l < 0 || l >= 12) {
            return false;
        }
        int nrz = zilePerLuna(l, a);
        if (z < 1 || nrz < 0 || z > nrz) {
            return false;
        }
        return true;
    }

    public String ziDinSaptamanaNastere(int a) {
        String[] zile = {"duminica", "luni", "marti", "miercuri", "joi", "vineri", "sambata"};
        Calendar c = new GregorianCalendar(a, this.luna, this.zi);
        return zile[c.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public String ziDinSaptamanaNastereOrig() {
        return ziDinSaptamanaNastere(this.an);
    }

    public String ziDinSaptamanaNastere() {
        return ziDinSaptamanaNastere(Calendar.getInstance().get(Calendar.YEAR));
    }

    public String apelativ(){
        int poz = nume.indexOf(" ");
        char c = nume.charAt(poz-1);
        boolean fata = "AEIOUaeiou".indexOf(c)>=0;
        return fata?"D-na ":"D-l ";
    }

    public String toString(){
        String[] tmp = nume.split(" ");
        String prenume = upperFirst(tmp[0]);
        String nume = upperFirst(tmp[1]);
        return apelativ()+nume+" "+prenume;
    }

    private String upperFirst(String s){
        char primul = Character.toUpperCase(s.charAt(0));
        String restul = s.substring(1).toLowerCase();
        return primul+restul;
    }

    public static void main(String[] args) {
        Persoana_solutie p = new Persoana_solutie("aNA poPa", 2014, 6, 1);
//        System.out.println(p.getDataNasterii());
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(p.ziDinSaptamanaNastere(2014));
        System.out.println(p.toString());
    }

}
