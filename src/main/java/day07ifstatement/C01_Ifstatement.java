package day07ifstatement;

import java.util.Scanner;

public class C01_Ifstatement {

    public static void main(String[] args) {

        // if it rains , I will cancel the picnic
        // Eger yagmur yagarsa;piknigi iptal edecegim

        //Ex 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz

        char ch = '*';

        if(ch>='A'  && ch<='Z'){
            System.out.println("Buyuk Harf");

        }//ıf body
        //Ex 2) Verilen bir sayi cift sayi ise ekrana cift sayi yazdiran kodu olusturunuz
        byte sayi=24;

        if(sayi%2==0){
            System.out.println(" Cift sayi");

        }// if body
        //Ex 3) Verilen bir sayi 300' den kucuk
        // veya 1200'den buyuk ise ekrana harika sayi yazdiran
        // kodu olusturunuz...

        int number =229;
                if(number<300 || number>1200){
                    System.out.println("Harika Sayi");
                }// if Body
        // Ex 4) Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz...

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int num= input.nextInt();
        if(num%2!=0){
            System.out.println("cıft sayi");
        }//if body
        if(num%2 ==0){
            System.out.println("Tek sayi");
        }//if body
        //2.yol
        if(num%2==0){
            System.out.println("Cift sayi");
        }else{              //else diger tum ihtimaller
                        //burada condıtıonal yok tek kontrol var
                        //bu sekilde javaya az is yaptirdik
            System.out.println("Tek sayi");
        }

        //Ex 5) Verilen bir sayinin negatif, pozitif ya da notr oldugunu soyleyen kodu yaziniz
            int numara= 0;

        if(numara<0){
            System.out.println("Negatif sayi");
        }else if(numara ==0){
            System.out.println("Notr sayi");
        }else {
            System.out.println("Pozitif Sayi");
        }

    }//main body

}//class body
