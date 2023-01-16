package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class C03_Arrays {
    //INTERWIEW QESTIONS
    //[0,2,3,0,12,0] sıfırları en sona koyunuz [2,3,12,0,0,0]
    public static void main(String[] args) {
        int original []={ 0,2,3,0,12,0};
        int yeni[] =new int[original.length];//[0,0,0,0,0,]
        int idx=0;
        for (int i = 0; i < original.length ;          i++) {//original array icin calısti

            if(original[i] != 0){
                yeni[idx]=original[i];


                idx++;// bir sonraki indexe gecer
            }

        }
        System.out.println(Arrays.toString(yeni));
    }
}
