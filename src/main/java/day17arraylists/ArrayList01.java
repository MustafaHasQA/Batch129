package day17arraylists;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {

    /*
        1) ArrayList(List)'ler coklu data depolamak ıcın kullanilir.
        2) ArrayList(List)'ler non-primitive data type'indeki coklu datalari depolamak icin kullanilir.
            List'ler "non-primitive" data kabul ederler ,"array" ler ise "primitive" data veya reference kabul eder.
        3) ArrayList(List)'leri olustururken icin eleman sayisini basta soylemeye gerek yoktur.
            List'ler eleman sayisina "Flexible" dirlar ama "array" ler "frexible" degildirler.
        4) Madem "Array" ler eleman sayisinda slexible degil nicin Java "Array" leri iptal etmedi ?
            i)Eleman sayisi belli polan datalari depolamak icin Array' ler tercih edilir.
            İİ)Arrey'ler cok hizli calisir
            iii)Array'ler memory' de cok az yer kaplar.
         */
    public static void main(String[] args) {

        //List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages); // []

        //List'lere eleman nasil eklenir?
        //List'e eleman eklemekicin add() mehhod'u kullaniriz.
        //add() method'u elemanlari sizin verdiginiz sirada "list"e ekler(Insertion Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);
        ages.add(3,777);
        System.out.println(ages);// [9,656,12,777,10]

        //List' coklu eleman nasil eklenir? veya List'e baska bir list nasil eklenir ?
        //Bir List'e coklu eleman eklemek icin o elemanlari once bir List'in icine koymalisiniz.

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);// [9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]]
        // Bir List'teki tüm elemanlari nasil silerim
//       ages.clear();
//       System.out.println(ages);//[]
        // Bir eleman List'te var olup olmadgini nasil kontrol ederiz ?
        boolean r = ages.contains(656);
        System.out.println(r);

        // Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz ?
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom" );
        names1.add("Jim" );
        names1.add("Kim" );

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom" );
        names2.add("Kim" );
        names2.add("Jim" );
        boolean s = names1.equals(names2);
        System.out.println(s);//false

        // Example 1) Verilen 2 İnteger List'te tamamiyla ayni elemanlari olup olmadigini kontrol eden kodu yaziniz

        ArrayList<Integer>nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer>nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);

        Collections.sort(nums2);
        boolean t = nums1.equals(nums2);
        System.out.println(t);//true






    }
}
