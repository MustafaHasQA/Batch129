package day24accessmodifiersinheritiance;

public class Student {
    /*
   Access Modifier
   1)public     2)protected
   3)default (Access Modifier'i default yapmak icin access modifier yazmayiz)
   yazarsan kizar
   4)private

   Note: Access Modifier'lari genisden dara dogru sayiniz
         public > protected > default > private
   Note: Access Modifier'lari birer birer aciklayiniz
         public olanlar her class'dan kullanilabilir
         protected olanlar baska package'lerden kullanilamaz
         ancak baska package'de "child class" icinden kullanilabilir
         default olanlar baska package'den kullanilamazlar
         private olanlar sadece olsturulduklari Class icinde kullanilabilirler
   Note: "protected" ile "default" un farkini soyleyiniz.
         protected olanlar baska package'lerden kullanilamaz ancak
         baska package'de "child class" icinden kullanilabilir
         default olanlar baska package'den kullanilamazlar
   Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
         public, default kullanilir ama protected ve private kullanilamaz
*/
    //public her classta kullanilabilir.
    public String stdName ="Mustafa ";


    //Protected olanlar baska packageden sadece child class'lardan gorulur
    protected String address="Istanbul";

    //default olanlar baska packageden
    //kullanilamazlar isyeri maili

    String email="mustafahasyildirim38@gmail.com";
    //private olanlar sadece olusturdukları
    //class ıcınde kullanilabilirler tc no

    private String tcNo="14566395";


}
