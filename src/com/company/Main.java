package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
    System.out.println("Введите два числа и символ выпонения действия над ними");
    int a, b;
    String operation;
    a = scr.nextInt();
    b = scr.nextInt();
    operation = scr.next();
    switch (operation){
        case "+":
            System.out.println(a + b);
            break;
        case "-":
            System.out.println(a - b);
            break;
        case "*":
            System.out.println(a * b);
            break;
        case "/":
            if (b == 0) {
                System.out.println("Данное действие совершить невозможно");
            }
            else{
                System.out.println(a / b);
            }
            break;
        default:
            System.out.println("Введен неверный знак");
    }
    }
}
