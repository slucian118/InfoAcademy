import java.util.*;


/**
 * Created by lucians on 04/09/15.
 *
 * 3.       APLICATII MEMBRI STATICI SI CLASE PREDEFINITE UTILE
 o        dandu-se un depozit bancar la termen pe o durata data (ex: 100 de zile) cu suma, data constituirii si dobanda anuala, sa se afle care este data scadentei si suma ce va fi retrasa la acea data
 o        in ce data pica prima duminica din februarie anul urmator?
 §         extensie: metoda primaZi(int ziSaptamana, int luna, int an)
 o        se scrie clasa Persoana:
 §         clasa va contine nume si data de nastere, ultima sub forma de zi, luna si an (variabile separate)
 §         metode
 §         constructori
 §         Persoana(String nume,int an, int luna, int zi)
 §         Persoana(String nume,Date d)
 §         Persoana(String nume,Calendar c)
 §         getteri
 §         String getDataNasterii() - afiseaza data formatata pe stil romanesc (16 ianuarie 1991)
 §         Date getDataNasteriiDate()
 §         Calendar getDataNasteriiCalendar()
 §         validareData(int an, int luna, int zi) (metoda statica)
 §         zilePerLuna(int luna, int an) (metoda statica)
 §         determinarea zilei din saptamana cand pica data de nastere
 §         ziDinSaptamanaNastere(int an) - in ce zi a saptamanii pica data de nastere in functie de an? (ex: in ce zi a saptamanii va pica ziua mea in 2013?)
 §         ziDinSaptamanaNastere() - in ce zi a saptamanii pica data de nastere anul curent
 §         ziDinSaptamanaNastereOrig() - in ce zi a saptamanii s-a nascut persoana
 §         apelativ() - metoda returneaza “D-l” sau “D-na” in functie de ultima litera din prenumele persoanei; convenim ca vocalele indica fete iar consoanele indica baieti
 §         toString() - returneaza numele persoanei, sub forma apelativ numefamilie prenume (numele de familie si prenumele vor avea prima litera capitalizata)
 *
 *
 */


public class Persoana {
    private String nume;
    private int an, luna, zi;

    public Persoana (String nume, int zi, int luna, int an){
        this.an=an;
        this.luna=luna;
        this.zi=zi;
        this.nume=nume;
    }

    public Persoana(String nume,Calendar c) {
        this (nume, c.YEAR, c.MONTH, c.DAY_OF_MONTH);
    }

    public Persoana (String nume, Date d) {
        this.nume = nume;
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(d);
        this.an=cal.YEAR;
        this.luna=cal.MONTH;
        this.zi=cal.DAY_OF_MONTH;
    }
    public String getDataNasterii(){
        String[] lunileAnului = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
        String rez=zi +" "+ lunileAnului[luna -1 ] +" "+ an;
        return rez;
    }

//    public Date getDataNasterii(){
//
//    }

    public static void main(String[] args) {
    Persoana aux= new Persoana("Ana", 11, 12, 2012);
    System.out.println(aux.getDataNasterii());
    }
}

