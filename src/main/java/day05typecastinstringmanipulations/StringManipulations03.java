package day05typecastinstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {


        /*
           Example 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
            i)En az 8 character olsun
            ii)Space characteri password'de olmasin
            iii)En az bir tane buyuk harf olsun
            iv)En az bir tane kucuk harf olsun
            v)En az bir tane sembol olsun
            vi)En az bir tane rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //1) En az 8 character olsun
        boolean first = pwd.length() > 7;
        System.out.println(first);

        boolean second = !pwd.contains(" ");

        System.out.println(second);

        //Note: Buyuk harf olmayanlari sil,
        //      Kalan character sayisina bak
        //      Character sayisi sifir ise buyuk harf yok demektir,
        //      sifirdan buyuk ise buyuk harf var demektir.

       boolean third =  pwd.replaceAll("[A-Z]","").length()>0;
        System.out.println(third);






    }
}


