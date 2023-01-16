package day20passbyvalueoverloading;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Pass By Value : Method'a Value2nun bir kopyasini gönder demeketir.
        Bu nedenle Pass by Value orjinal parametre degismez.

        Java Pass By Value kullanilir.
        1) Java vareiable'in orjinal degerini korumak ister.
        2) Java variables'in icindeki degeri kopyalar ve methodun icine kopya degeri gönderir.
        deger üzerinde yapilan degisiklikler orjinal parametereyi etkilemez.

        Pass By Referance ' da ise referans kopyalanir ve methodda kullanilir.
        Yapilan degisiklik orjinal parametreyi etkiler
        Bu tarz programlar degeri korumak istiyorsa isi developere bırakmistir.

        kendisi degeri degistirir.

         */


        int gomlek=100;
        System.out.println("gomlek = " + gomlek);//100

      //  ogrenciIndirimi(gomlek);
       // System.out.println("gonlek = " + gomlek);//100
     gomlek= ogrenciIndirimi(gomlek);
        System.out.println("atamadan sonra maindeki gomlek " +gomlek);

    }//main

    private static int ogrenciIndirimi(int gomlek) {

        int ogrenciGomlegi=gomlek-10;
        System.out.println("ogrenciGomlegi " +ogrenciGomlegi);//ogrenciGomlegi = 90
        return ogrenciGomlegi;
    }//ogrenciIndırımı Meth
}
