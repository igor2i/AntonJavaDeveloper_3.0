package com.antonDeveloper.Lesseon.num4;

import java.util.ArrayList;

/**
 * Created by Admin.
 *
 * Определите колличество положительных элементов каждой строки матрицы A(M,N) и запомнить их в массиве B
 *
 */
public class PlusElemVMatrix {

    public static void plusElemVMatrix(){


        int RAZMER_MATRIX = 10;

        int [][] A = new int[RAZMER_MATRIX][RAZMER_MATRIX];


        for(int M = 0; M < RAZMER_MATRIX ; M++){

            for(int N = 0; N < RAZMER_MATRIX ; N++){

                A[M][N] = (int)(Math.random()*200) - 100;

            }
        }

        System.out.println("Создана матрица со случайными числами ");

        for(int M = 0; M < 10 ; M++){
            System.out.print("|");
            for(int N = 0; N < 10 ; N++){
                if(A[M][N] > 0) {
                    if(A[M][N] < 10) {
                        System.out.print("   " + A[M][N] + " ");
                    }else{
                        System.out.print("  " + A[M][N] + " ");
                    }
                }else{
                    if(A[M][N] > -10) {
                        System.out.print("  " + A[M][N] + " ");
                    }else{
                        System.out.print(" " + A[M][N] + " ");
                    }
                }
            }
            System.out.println("|");
        }

        ArrayList<Integer> B = new ArrayList<Integer>(); //динамический массив

        for(int M = 0; M < RAZMER_MATRIX ; M++){
            for(int N = 0; N < RAZMER_MATRIX ; N++){
                if(A[M][N] > 0) {
                    B.add(A[M][N]);
                }
            }
        }

        System.out.println("Всего положительных элементов в матрице "+ B.size());
        System.out.println("Положительные числа из массива:");
        for(int i = 0 ; i < B.size() ; i++ ){

            System.out.print(" "+ B.get(i) +" ");

        }


    }

}
