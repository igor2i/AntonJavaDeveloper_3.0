package com.antonDeveloper.Lesseon.Num5;

import com.antonDeveloper.Shared.FunkciyaNahojdenNaimen;

/**
 *
 * Created by Admin.
 *
 * Даны числа A,B,C.
 * Получить с использованием функции пользователя наименьшее значение.
 * Числа передаются функции из основной программы в качестве параметров.
 *
 */
public class NaimenIzTrexChisel {

    public static void naimenIzTrexChisel(){

        int A = (int)(Math.random()*50) - 25; //случайное значение от -25 до 25
        int B = (int)(Math.random()*50) - 25;
        int C = (int)(Math.random()*50) - 25;

        System.out.println("A = " + A + "; B = " + B + "; C = " + C);

        int[] sort =  FunkciyaNahojdenNaimen.funkciyaNahojdenNaimen(A, B, C);

        System.out.println("Отсортированный массив: " + sort[0] + " " +sort[1] + " " + sort[2]);

    }

}
