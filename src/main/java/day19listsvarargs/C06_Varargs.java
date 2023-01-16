package day19listsvarargs;

public class C06_Varargs {
    public static void main(String[] args) {

        /*
        Farkli sayida datalar ile çalışabilmek için varargsler olusturulmustur
        farkli parametreleer ike calişabilen methodlar olusturmak icin varags2lar kullanilir

        varags'larin arka tarafinda array'ler calisir

        Varags'lar olusurulur(data type.. varags ismi) veya( data type...varagsismi)
        varargs en sonda olmak sartıyla  bir method olustuturken farkli data type'lari kullanabilir****
        varargs'ler bir method birden fazla kullanilamaz.==unreachable code olur.
         */

        ikiSayiyiTopla(2, 3);
        ucSayiyiTopla(6, 8, 14);
        dortSayiyiTopla(56, 96, 40, 30);

    }

    private static int dortSayiyiTopla(int i, int i1, int i2, int i3) {

        return i + i1 + i2 + i3;
    }

    private static int ucSayiyiTopla(int i, int i1, int i2) {
        return i + i1 + i2;
    }

    private static int ikiSayiyiTopla(int i, int i1) {
        return i + i1;
    }

    private static int add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;

        }
        return sum;


    }


}