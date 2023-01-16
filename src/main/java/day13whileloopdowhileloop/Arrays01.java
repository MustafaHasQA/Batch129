package day13whileloopdowhileloop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 12;// Bu yapinin icinde sadece bir tane data depolanabilir
        //ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyacı hissederiz
        //Bir yapinin icinde coklu data depolayabilme icin Java "Array" yapisini olusturmustur

        //Array nasıl olusturulur ?
        //Array olusturmak icin Array elemanlarının "data type" i ve "eleman sayisi" mutlaka yazilmalidir
        String stdNames[] = new String[5];

        //Array consola nasil yazdirilir?
        //toString() method'unu kullanmadan sadece array ismi ile yazdirirsaniz Java o Array'in adrsini yadirir

        System.out.println(Arrays.toString(stdNames));//[null, null, null, null ]

        // Array'e eleman ekleme nasil yapilir?
        stdNames[2] = "ajda";
        stdNames[0] = "cuneyt";
        stdNames[1] = "kemal";
        stdNames[3] = "ezel";
        stdNames[4] = "besir";
        System.out.println(Arrays.toString(stdNames));//[cuneyt, kemal, ajda, ezel, besir]
        //Array'den specific bir elemanı almak
        System.out.println(stdNames[2]);
        // Example 1: Arary'deki her elemani sonuna "!" isareti koyarak ekrana yazdiriniz
        for(int i=0; i<stdNames.length;  i++){

            System.out.println(stdNames[i] +"!" );

        }

    }
}
