package com.tutorial;

public class main {
    public static void main(String[] args){
        //operasi aritmatika

        int variabel1 =28;
        int variabel2 =8;

        //1. Penjumlahan
        int hasil;
        hasil=variabel1+variabel2;
        System.out.println(variabel1 + "+" +variabel2+ "=" + hasil);
        //2. Pengurangan
        hasil=variabel1-variabel2;
        System.out.printf("%d-%d=%d \n", variabel1,variabel2,hasil);
        //3. Perkalian
        hasil=variabel1*variabel2;
        System.out.printf("%dx%d=%d \n", variabel1,variabel2,hasil);
        //4. Pembagian
        hasil=variabel1/variabel2;
        System.out.printf("%d/%d=%d \n ", variabel1,variabel2,hasil);
        //5. Maodulus
        hasil=variabel1%variabel2;
        System.out.printf("%dmod%d=%d \n", variabel1,variabel2,hasil);
    }
}
