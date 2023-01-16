package day12loops;

import java.util.Scanner;

public class C01_ForLoopIfElse {

    /*
 Kullanicidan baslangic ve bitis degerlerini alin
 Baslangic degerinden baslayipbitis degerine kadar tum tamsayilari
 ekrana yazdiriniz


  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangıc degerini giriniz");
        int baslangic = input.nextInt();//10
        System.out.println("lutfen bitis degerini giriniz");

        int bitis = input.nextInt();//15

        if(baslangic>bitis){
            System.out.println("Verdiginiz baslangic degeri bitis degerinden kucuk olmali");
        }else {

            for (int i = baslangic; i <= bitis; i++) {
                System.out.print(i + " ");

            }//fori
        }//else
         /*
 Kullanicidan baslangic ve bitis degerlerini alin
 Baslangic degerinden baslayipbitis degerine kadar tum cift tamsayilari
 ekrana yazdiriniz //10 12 14
        ****ödev****

  */

    }//main
}//class
