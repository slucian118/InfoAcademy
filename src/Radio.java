
public class Radio {
    private int volum;
    private boolean onOff;
    private int VOL_MAX;
    private String[] posturi = {"ProFM", "Radio21", "Death FM", "Antena satelor"};
    private int postCurent;

    public Radio(int vmax){
        if(vmax<1) VOL_MAX=3;
            // if(vmax<1) throw new IllegalArgumentException("Volumul maxim tb sa fie >=1!");
        else VOL_MAX=vmax;
    }

    public Radio(){
        this(3);
    }

    public void porneste(){
        if(onOff){
            System.out.println("Aparatul e deja pornit!");
        }else{
            onOff = true;
            volum = 1;
            System.out.println("Aparatul dvs a fost pornit");
        }
    }

    public void opreste(){
        if(!onOff){
            System.out.println("Aparatul e deja oprit!");
        }else{
            onOff = false;
            volum = 0;
            System.out.println("Aparatul dvs a fost oprit");
        }
    }

    public void daMaiTare(int nrTrepte){
        if(nrTrepte<=0){
            System.out.println("Nr de trepte invalid!");
            return;
        }

        if(!onOff){
            System.out.println("Aparatul nu este pornit");
            return;
        }

        if(volum+nrTrepte>VOL_MAX){
            System.out.println("Nu pot da mai tare cu atatea trepte!");
            return;
        }

        volum += nrTrepte;
        System.out.println("Aparatul dvs a fost dat mai tare cu "+nrTrepte+" trepte");
    }

    public void daMaiTare(){
        daMaiTare(1);
    }

    public void daMaiIncet(int nrTrepte){
        if(nrTrepte<=0){
            System.out.println("Nr de trepte invalid!");
            return;
        }

        if(!onOff){
            System.out.println("Aparatul nu este pornit");
            return;
        }

        if(volum-nrTrepte<=0){
            System.out.println("Nu pot da mai incet cu atatea trepte!");
            return;
        }

        volum -= nrTrepte;
        System.out.println("Aparatul dvs a fost dat mai incet cu "+nrTrepte+" trepte");
    }

    public void daMaiIncet(){
        daMaiIncet(1);
    }

    public void stare(){
        System.out.println("Aparatul este "+(onOff?"pornit":"oprit"));
        if(onOff){
            System.out.println("Treapta de volum curenta este: "+volum);
            afisarePostCurent();
        }
    }

    public void postUrmator(){
        if(!onOff){
            System.out.println("Aparatul nu este pornit!");
        }else{
            postCurent = ++postCurent%posturi.length;
            afisarePostCurent();
        }
    }

    public void postPrecedent(){
        if(!onOff){
            System.out.println("Aparatul nu este pornit!");
        }else{
            postCurent=((postCurent==0)?posturi.length-1:postCurent-1);
            afisarePostCurent();
        }
    }

    private void afisarePostCurent(){
        System.out.println("***************************************");
                System.out.println("Sunteti pe postul "+posturi[postCurent]);
        System.out.println("***************************************");
    }

    public static void main(String[] args) {
        Radio r = new Radio(5);
        r.opreste();
        r.porneste();
        r.stare();
        r.daMaiIncet();
        r.daMaiTare(4);
        r.daMaiTare(2);
        r.daMaiTare();
        r.porneste();
        r.opreste();
        r.postUrmator();
        Radio r1 = new Radio(); // --> 3 trepte
        Radio r2 = new Radio(-2); // --> 3 trepte
    }
}
