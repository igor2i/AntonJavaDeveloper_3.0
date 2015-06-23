package com.antonDeveloper.Lesseon.num2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Admin.
 *
 * Найти сумму значений функции, больше 2 Z=sin(1/x)+5*cos(1/(x-3))+x для x, ихменяющегося на отрезке [-3,8] с шагом 0,2
 *
 */
public class IfFynkciyaBolshe2 {

    public static void ifFynkciyaBolshe2(){

        double z;

        int PREDEL_FUNKCII = 2;

        int OTREZOK_MIN = -3;

        int OTREZOK_MAX = 8;

        double SHAG = 0.2;


        for(  double x = OTREZOK_MIN  ; x < (OTREZOK_MAX + SHAG)  ; x += SHAG  ){

            x = new BigDecimal(x).setScale(1, RoundingMode.HALF_UP).doubleValue();

            z = Math.sin(1./x)+5.*Math.cos(1./(x-3.))+x;

            System.out.println("При x = " + x + ", функция Z = " + z);

            if(z > PREDEL_FUNKCII){
                System.out.println("Z больше или равно двум, при X = " + x);
                break;}


        }

    }

}
