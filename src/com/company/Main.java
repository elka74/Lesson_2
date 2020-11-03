package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
    int x, b;
    int [] a= new int [10];
        a[0] =5;
        a[1] =3;
        a[2] =8;
        a[3] =1;
        a[4] =4;
        a[5] =23;
        a[6] =12;
        a[7] =7;
        a[8] =9;
        a[9] =100;
        bubbleSort(a);
        for (int i = 0; i < 10; i ++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Введите два числа и символ выпонения действия над ними");
    String operation;
    x = scr.nextInt();
    b = scr.nextInt();
    operation = scr.next();
    switch (operation){
        case "+":
            System.out.println(x + b);
            break;
        case "-":
            System.out.println(x - b);
            break;
        case "*":
            System.out.println(x * b);
            break;
        case "/":
            if (b == 0) {
                System.out.println("Данное действие совершить невозможно");
            }
            else{
                System.out.println((float)(x) / (float)(b));
            }
            break;
        default:
            System.out.println("Введен неверный знак");
    }
     //for (int i = 0; i < 5; i++){ //объявление цикла for
         //System.out.println("i =  " + i);
     //}
     //for (int i =17; i > 7; i -= 2){ //счетчик назад
         //System.out.println("i =  " + i);
     //}
     //for (int i = 0, j = 12; i <= j; i++, j--){ //несколько управляющих переменных
         //System.out.println(" i - j:  " + i + " - " + j);
   //  }
     //for(;;){ //бесконечный цикл
        // System.out.print("*");
    //}
    }
    public static void bubbleSort(int[] a){ //метод пузырьковой сортировки
        for (int i = 0; i < a.length -1; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if (a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }

    }
}
