package practiceDTNT;

import java.util.Scanner;

public class C03_IfStatement {
      /*
    Kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
    Girilen pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli " yazdirin
    3 basamakli degilse cift olup olmadigini kontrol edin
    Cift ise "3 basamakli olmayan cift sayi" yazdirin
    Cift degilse " 3 basamakli olmayan tek sayi" yazdirin
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = input.nextInt();

        System.out.println("********* if ile cozumu***************");


        if (sayi > 0) {
            boolean sifirdanBuyukUcBas = sayi > 99 && sayi < 1000;
            boolean sifirdanBuyukUcBasOlmayanCift = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;


            if (sifirdanBuyukUcBas) {
                System.out.println("3 basamakli sayi ");
            } else if (sifirdanBuyukUcBasOlmayanCift) {
                System.out.println("3 basamakli sayi ");

            } else
                System.out.println("3 basamakli olmayan pozitif tek sayi");
        } else {//negatif sayilar icin burasi calisr
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
        }//if body
        System.out.println("*** Ternary *******");
        boolean sifirdanBuyukUcBaster = sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasOlmayanCiftter = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;

        //sart    ?   True Action           :   False Action


        String sonuc = sayi>0    ? sifirdanBuyukUcBaster ? ("3 basamakli sayi"):sifirdanBuyukUcBasOlmayanCiftter ? ("3 basamakli cift sayi"):
                ("3 basamakli tek sayi") :("Lutfen pozitif bir tamsayi giriniz");

        System.out.println(sonuc);
    }
}