package practiceDTNT.Practice04;

public class HesapMakinesi {


    public void toplama(int... a) {
        int toplam = 0;

        for (int w : a
        ) {
            toplam += w;
        }
        System.out.println("toplam :" + toplam);
    }

    public void cikarma(int... a) {
        int fark = 0;

        for (int w : a
        ) {
            fark -= w;
        }
        System.out.println("fark : " + fark);
    }

    public void carpma(int... a) {

        int carpim = 1;

        for (int w : a
        ) {
            carpim *= w;
        }
        System.out.println("carpim : " + carpim);
    }

    public void bölme(int a, int b) {
        if(b ==0){
            System.out.println("Hicbir sayi sifira bolunemez");
        }else {
            System.out.println("bolme : " + a/b);
        }


    }
}



