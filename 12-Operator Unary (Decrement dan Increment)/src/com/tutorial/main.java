package com.tutorial;

public class main {
    public static void main(String[] args0) {
        System.out.println("====OPERATOR UNARY====");
        System.out.println("adalah operasi yang dilakukan pada satu variabel");
        //unary + dan -
        int angka = 1;
        System.out.printf("Unary '-' %d menjadi %d \n", angka, -angka);

        //unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.printf("nilai angka++ menjadi %d \n", angka2);

        int a=7;
        System.out.printf("Nilai %d dengan '++%d' prefix = %d\n",a,a,++a);
        int b=7;
        System.out.printf("Nilai %d dengan '%d++' prefix = %d\n",b,b,b++);

        //unary boleaan
        boolean syawal=true;
        System.out.println("Nilai boleaan = "+ syawal);
        System.out.println("Nilai boleaan = "+ !syawal);
    }
}
