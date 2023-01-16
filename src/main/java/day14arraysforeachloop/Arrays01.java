package day14arraysforeachloop;

import java.util.Arrays;


public class Arrays01 {
    public static void main(String[] args) {
        //Ex1) String array olusturun icine 5 tane elaman ekleyin, ilk eleman ile son elemanin
        //     icerdigi karakter sayisilari toplamini ekrana yazdirin
        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";
        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]

        System.out.println(arr[0].length() + arr[arr.length-1].length());//7

        //Example 2: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
//             icerdigi karakter sayilari toplamini ekrana yazdiriniz.

        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Atina";

        //1.Yol for-loop
        int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {//Arrayler ile calisirken baslangic '0' alinir. Cunhu arrayler index kullanir
            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);//32





        int sum = 0;
        for(String w : brr){
            sum = sum + w.length();

        }

        System.out.println(sum);



    }
}
