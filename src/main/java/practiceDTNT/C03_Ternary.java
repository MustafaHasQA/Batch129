package practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {
    /*
TASK :
 Kullanicidan bir character girmesini isteyiniz
 Character harf ise kucuk harf olup olmadigini kontrol ediniz
 Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
 Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
 Harf degilse ekrana "Harf degil" yazdiriniz
 97:a  122:z ascii değeri
 */

    /*
    Ascii degerler verilmeseydi
    char a='a';
    System.out.println(a+0);
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bır karakter giriniz");
        char ch =input.next().charAt(0);

        System.out.println("*********************TERNARY************************");

        boolean harfMi=(ch<'z' && ch>='a')  || (ch<='Z' && ch>='A');
        boolean kucukHarf=(ch<='z' && ch>='a');

        String result=(harfMi)   ? kucukHarf ? "Kucuk Harf"     :"Buyuk Harf"   : "Harf Degil" ;
        System.out.println("result = " + result);

        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("Harftir");

        } else System.out.println("Harf Degildir");

    }
}
