package practiceDTNT.Practice04;

public class HesapMakinesiVarargs {
    public static void main(String[] args) {

        HesapMakinesi islem =  new HesapMakinesi();

        islem.toplama(3,5,7,96,54,-85,25);
        islem.cikarma(10,10,0,40,20);
        islem.carpma(15,63,28,-8);
        islem.bölme(10,5);
    }
}
