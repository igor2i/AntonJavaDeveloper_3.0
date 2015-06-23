package com.antonDeveloper;

import com.antonDeveloper.Lesseon.Num5.NaimenIzTrexChisel;
import com.antonDeveloper.Lesseon.num1.Nravno0or2;
import com.antonDeveloper.Lesseon.num2.IfFynkciyaBolshe2;
import com.antonDeveloper.Lesseon.num3.SumFunkcii;
import com.antonDeveloper.Lesseon.num4.PlusElemVMatrix;

import java.awt.event.*;
import java.io.FileNotFoundException;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class AMenu extends JFrame{

    public AMenu(){

        super("Программы №17 Капущи Антон");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Box countLabel1 = Box.createHorizontalBox();

        JToggleButton ButtonNRavno0or2 = new JToggleButton("1. N=0 or %2");
        JToggleButton ButtonIfFynkciyaBolshe2 = new JToggleButton("2. Если Z > 2 ");
        JToggleButton ButtonSumFunkcii = new JToggleButton("3. Сумма функций ");
        JToggleButton ButtonPlusElemVMatrix = new JToggleButton("4. Положительные элементы в матрице ");
        JToggleButton ButtonNaimenIzTrexChisel = new JToggleButton("5. A?B?C ");

        Box mainBox = Box.createVerticalBox();


        countLabel1.add(ButtonNRavno0or2);
        countLabel1.add(ButtonIfFynkciyaBolshe2);
        countLabel1.add(ButtonSumFunkcii);
        countLabel1.add(ButtonPlusElemVMatrix);
        countLabel1.add(ButtonNaimenIzTrexChisel);
        countLabel1.setBorder(new TitledBorder("Задания."));


        mainBox.add(countLabel1);

        setContentPane(mainBox);


        ButtonNRavno0or2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Nravno0or2.nravno0or2();
            }
        });

        ButtonIfFynkciyaBolshe2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IfFynkciyaBolshe2.ifFynkciyaBolshe2();
            }
        });

        ButtonSumFunkcii.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SumFunkcii.sumFunkcii();
            }
        });

        ButtonPlusElemVMatrix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlusElemVMatrix.plusElemVMatrix();
            }
        });

        ButtonNaimenIzTrexChisel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NaimenIzTrexChisel.naimenIzTrexChisel();
            }
        });

    }


    public static void main(String[] args) throws FileNotFoundException    {
        AMenu app = new AMenu();

        app.setVisible(true);
        app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна

    }
}