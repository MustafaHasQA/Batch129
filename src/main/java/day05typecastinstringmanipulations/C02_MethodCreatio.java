package day05typecastinstringmanipulations;

public class C02_MethodCreatio {

    //Dikdörtgenin alanını hesaplayan methodu olusturunuz ve kullaniniz

    public static void main(String[] args) {

        //protokol alanı

        System.out.println(dikdortgenAlani(5, 10));

    }//main body'si
    /*
             Acces          static   Data     methodAdi  (parametreler)
               modifier              type
     */

    public  static int  dikdortgenAlani (int a,int b){

        // main method static oldugu ıcın main static olmasi gerekir
        //method adi Camel Case kucuk harf hablar sonraki her kelimenin ilk harfi buyuk olur

        return a*b;  //carpmanın sonucunu kullaniya ver
    }

}//class
