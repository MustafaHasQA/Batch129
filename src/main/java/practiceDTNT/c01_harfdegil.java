package practiceDTNT;

import java.util.Scanner;

public class c01_harfdegil {
    public static void main(String[] args) {

      /*
    Ascii degerler verilmeseydi
    char a='a';
    System.out.println(a+0);
     */


            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bır karakter giriniz");
            char ch =input.next().charAt(0);


            boolean harfMi=(ch<'z' && ch>='a')  || (ch<='Z' && ch>='A');
            boolean kucukHarf=(ch<='z' && ch>='a');



            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                System.out.println("Harftir");

            } else System.out.println("Harf Degildir");

        }
    }


