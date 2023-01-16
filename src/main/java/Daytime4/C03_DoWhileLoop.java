package Daytime4;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */

        int numberofbananas=165;//4 8 12 ........164 ==> geriye 1 muz kaldi
        int survivaldays=1;     //1 2 3  ........41 ==> 42. gün öldü
        boolean monkeyalive=true;

        do {
            System.out.println("************** maymunlar günde 4 muz yer   ***********");
            numberofbananas-=4; // toplam muz sayisindan hergun 4 muz eksiltir
            System.out.println("kalan muz sayisi"+ numberofbananas);
            survivaldays++;
            if(numberofbananas<4){
             monkeyalive=false;

                System.out.println("bugun"+survivaldays+" . gun yeterli muz kalmadi. Maymun rahmetli. Rest in peace");
                System.out.println("maymun"+survivaldays+" . gun oldu");

            }else{
                System.out.println("Bugun "+survivaldays+" .gun; maymun hala yasiyor");
            }


        }while (monkeyalive);//do while
    }//main
}
