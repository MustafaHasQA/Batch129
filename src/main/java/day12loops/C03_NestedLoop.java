package day12loops;

import java.util.Scanner;

public class C03_NestedLoop {

    /*
       Example 2: Asagidaki sekli cizen kodu yaziniz
                   1
                   1 2
                   1 2 3
                   1 2 3 4
                   1 2 3 4 5
*/
    public static void main(String[] args) {

        for (int i = 1; i <6;                   i++){//satir kontrolü

            for (int j = 1; j <=i ;             j++){//rakam kontrolu
                System.out.print(j+" * ");

            }
            System.out.println();//alt satira atti

        }
        /*

    Example 2: Asagidaki sekil cizen kodu yaziniz
                * * * *
                * * *
                * *
                *
 */
        System.out.println("Example 2");
        int satir=4;
        for (int i = 1; i <=satir ;                    i++) {//sati kontrol
            for (int j =satir ; j >=i ;                 j--) {//yildiz kontrol
                System.out.print("* "); //yildiz yazdirir


            }
            System.out.println();//asagiya atar

        }

        /*

         *
        * *
       *   *
      *     *
     * * * * *

        Satir sayisini kullanicidan alarak yukaridaki sekli yazdiriniz
             */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int row=input.nextInt();


        for (int i = 1; i <=row ;                   i++) {//satir kontrol
            for (int bosluk = row; bosluk >= i;             bosluk--) {// bosluk kontrol
                System.out.print(" ");

            }
            for (int yildiz = 1; yildiz <= i;       yildiz++) {//* kontrol

                if (yildiz == 1 || yildiz == i) {
                    System.out.print("* ");//en distaki yildizlar
                } else if (i == row) {
                    System.out.print("* ");//en alt *
                } else
                    System.out.print("  ");//3. ve 4.satir
            }
            System.out.println();

        }
    }//main
}//class
