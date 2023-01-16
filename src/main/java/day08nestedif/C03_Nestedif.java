package day08nestedif;

import java.util.Scanner;

public class C03_Nestedif {
  /*
Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz

 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \nKadin icin K harfi, \nErkek icin E harfi giriniz");
        char cinsiyet =input.next().toUpperCase().charAt(0);//Kuulanicidan aldıgım harfi buyuk harfe cevırdım
        System.out.println("Lutfen yasınızı gırınız");
        int yas = input.nextInt();


        if (cinsiyet == 'K'){

        }
    }





}
