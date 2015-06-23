package com.antonDeveloper.Lesseon.num3;

import java.util.Scanner;

/**
 * Created by Admin.
 *
 * Вычеслить сумму значений функции Yk = Ak^2 + Ak - SIN Ak, где элементы массива А вводятся с клавиатуры
 *
 */
public class SumFunkcii {

    static double Scan(){
        Double d = 0.0;
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            d = sc.nextDouble(); // считывает целое число с потока ввода и сохраняем в переменную
        }else {
            System.out.println("Требуется ввести число");
            Scan();
        }
        return d;
    }

    public static void sumFunkcii(){

        int KOLL_FUNKCII = 5;

        double y = 0.0;

        double[] a = new double[KOLL_FUNKCII];

        System.out.println("Введите массив");
        for (int i = 0; i < KOLL_FUNKCII; i++){
            a[i] = Scan();
        }


        for(int i = 0;   i < KOLL_FUNKCII   ; i++  ){

            y += Math.pow(a[i],2) + a[i] - Math.sin(a[i]);

        }

        System.out.print("При k = " + KOLL_FUNKCII + ", и A введёном с помщю массива : ");
        System.out.print("\"");
        for(int i = 0;   i < KOLL_FUNKCII   ; i++  ){
            System.out.print(a[i] + "; ");
        }
        System.out.println("\"");
        System.out.println("Функция Yk = Ak^2 + Ak - SIN Ak = " + y );


    }

}
