package day05typecastinstringmanipulations;

public class StringManipulations01 {


    //String bir non-primitive data type'dir ve ayni zamanda bir class'dir.

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String'indeki tum character'leri buyuk harf yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //Example 2: "s" String'indeki tum character'leri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Example 3: "s" String'indeki ilk character'i aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Example 4: "s" String'indeki ikinci ve sondan ikinci character'i aliniz ve ekrana yanyana yazdiriniz.
        char secondChar = s.charAt(1);//a
        char secondLastChar = s.charAt(10);//s

        //1.Yol: Ayni satirda yazdirmak icin
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2.Yol: Ayni satirda yazdirmak icin
        System.out.println("" + secondChar + secondLastChar);

        int slength = s.length();
        System.out.println(slength);

        String sub1 = s.substring(0, 4);
        System.out.println(sub1);

        String sub2 = s.substring(5, 7);
        System.out.println(sub2);
        String sub3 = s.substring(8, 12);
        System.out.println(sub3);
        String sub4 = s.substring(8);
        System.out.println(sub4);









    }
}