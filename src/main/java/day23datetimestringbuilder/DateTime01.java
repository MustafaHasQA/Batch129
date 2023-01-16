package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1: Time'i formatlayiniz.
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//21:38:57.472981500

        //hh-->12 lik saat sisteminde kullanilir  - HH--> 24 LÜK SAAT SİSTEMİNDE KULLANİLİR
        //hh  kullandiginizda Am veya PM demelisiniz , bunu demek icin "a" yazmaniz yeterlidir. Yani; "hh:mm a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println(dtf.format(myTime));//09-42 ÖS(pm)

    }
}
