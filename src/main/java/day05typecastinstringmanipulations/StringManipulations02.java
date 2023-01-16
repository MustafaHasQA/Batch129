package day05typecastinstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);// Learn Java earn dollar

        //Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine ceviriniz.
        String s2 = s.replace("earn", "win");
        System.out.println(s2);// Lwin Java win money

        //Example 4: "s" String'indeki "a" harflerini "*" a ceviriniz.
        //Note: replace() method'unda coklu character ile calisirsaniz mecbur cift tirnak kulanacaksiniz
        //      Ama tek character ile calisirsaniz cift tirnak veya tek tirnak kullanabilirsiniz.
        String s3 = s.replace('a', '*');
        System.out.println(s3); // Le*rn J*v* e*rn money


        //Note: Ama ya ikisi de cift tirnak olmalidir, ya da ikis de tek tirnak olmalidir.
        //Example 5: "s" String'
    }
}