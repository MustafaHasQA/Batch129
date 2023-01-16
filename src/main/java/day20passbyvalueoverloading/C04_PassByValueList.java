package day20passbyvalueoverloading;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

   /*
       bir list oluşturalım.
       sonra list elemanlarını degiştir methodu yazıp orada
       list elemanlarından bazılarını degiştirelim.
       method void olsun.
       main methoda döndükten sonra yeniden listi yazdıralım
       */

    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");


        listElemanlariniDegistir(harfler);
        System.out.println("Main icinde methoddan sonra harfler" + harfler);//[R,B,C,D]
        //Listemizde icindeki elemanlardan bir yada birkacını degistirmdigimizde
        //Listeyi degistiris olmuyıruz. Pass By Value  array ve listlerde de aynen gecerlidir.
        // Ama listenin kendisini degistirmis olmuyoruz

        listDegistir(harfler);
        System.out.println("Main icinde methoddan sonra harfler = " + harfler);



    }//main

    private static void listDegistir(List<String> harfler) {

        harfler= new ArrayList<>();
        System.out.println("Methodda yeni list harfler = "+ harfler);//= []
    }

    private static void listElemanlariniDegistir(List<String> harfler) {
        harfler.set(0,"R");
        System.out.println("Method icindeki harfler = " + harfler) ; // [R,B,C,D]



    }//method
}