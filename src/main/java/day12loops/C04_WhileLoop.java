package day12loops;

public class C04_WhileLoop {
    public static void main(String[] args) {
        // 3'den 10'a kadar tamsayilari ayni satira yazdiran kodu yaziniz

        //1.yol
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");

        }
        //2.yol
        System.out.println();

        int i = 3;//baslangic degeri

        while (i < 11) { //bitis degeri
            System.out.print(i + " ");
            i++;//artirma while loop'un {}icinde

        }

        // 17'den 4'e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

        int k = 17;

        while (k > 3) {//bitis degeri
            if (k % 2 == 0) {//ciftse

                System.out.println(k + " ");

            }//if
            k--;
        }//while

        //2.Yol: for-loop
        int a = 6841;
        int toplam = 0;

        for(int m = a; m>0; m/=10){
            toplam = toplam + m%10;
        }
        System.out.println(toplam);//19

        }









    }



