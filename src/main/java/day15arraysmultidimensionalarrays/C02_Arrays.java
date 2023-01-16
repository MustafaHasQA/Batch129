package day15arraysmultidimensionalarrays;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class C02_Arrays {
    //Bir strındekı sesli harflerin sayisini bulan kodu yaziniz
    //                      a  -  e  -  i  -  o  -  u  -  A  - E - I - O - U
    public static void main(String[] args) {
        String str="Java ogrenınce para kazanmak ne kolay, ogrenmeyeınce ne kadar zor";
        str=str.toLowerCase();

        String harfler[] = str.split("");
        System.out.println(Arrays.toString(harfler));//[j, a, v, a,  , o, g, r, e, n, ı, n, c, e,  , p, a, r, a,
        // , k, a, z, a, n, m, a, k,  , n, e,  , k, o, l, a, y, ,,  , o, g, r, e, n, m, e, y, e, ı, n, c, e,  , n, e,  , k, a, d, a, r,  , z, o, r]
        int counter =0;
        //iter==for each loop
        for(String w: harfler) {
            switch (w) {
                case "a" :
                case "e" :
                case "o" :
                case "u" :
                case "i" :
                    counter++;
            }
        }//for each
        System.out.println(counter);
    }
}
