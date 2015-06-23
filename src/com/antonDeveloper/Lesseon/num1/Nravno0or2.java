package com.antonDeveloper.Lesseon.num1;

import java.util.Scanner;

/**
 * Created by Admin.
 * Ввести с клавиатуры и напечатать N чисел, если введено равное 0 или кратное 2 число, ввод и печать прекращается.
 */
public class Nravno0or2 {

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

    public static void nravno0or2(){

       for(int i = 0 ;  i != (i+2)  ; i++  ) {

            double n = 0;

            System.out.println("Введите число n=");
            n = Scan();

            if(n == 0 || n%2 == 0) {
                System.out.println("Введённое число равно 0 или кратно 2 - " + n);
                break;
            }
            System.out.println("Введёное число = " + n);
       }



    }

}
