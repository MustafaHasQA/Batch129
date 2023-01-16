package day21overloadingstatic;

import java.util.Scanner;

public class C02_Static {

    static int sayi1; // static variable
    int sayi2; // static olmayan variable = instance

    public static void main(String[] args) {   //protokol

        System.out.println("sayi1 = " + sayi1);  //0
        C02_Static obj1=new C02_Static();
        //Scanner input= new Scanner(System.in);
        System.out.println("sayi2"+obj1.sayi2);


        sayi1++;
        System.out.println("sayi1 = " + sayi1);//1
        obj1.sayi2++;
        System.out.println("sayi2 = " +obj1.sayi2);//1
        C02_Static obj2 = new C02_Static();
        System.out.println(obj2.sayi2);//0



    }//main
}
