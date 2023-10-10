package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Считать потоком ввода три числа, введенных пользователем, и сохранить их в целочисленных переменных a, b и c*/
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

		/*Вывести на консоль переменные, значения которых делятся на 5 (вида: a=25, c=15),
		  если нет ни одного значений, делящегося на 5, вывести строку: "нет значений, кратных 5"*/
        StringBuilder result = new StringBuilder();
        if (a % 5 == 0) {
            result.append("a=").append(a).append(", ");
        }
        if (b % 5 == 0) {
            result.append("b=").append(b).append(", ");
        }
        if (c % 5 == 0) {
            result.append("c=").append(c).append(", ");
        }
        if (result.length() == 0) {
            result.append("нет значений, кратных 5");
        } else {
            result.delete(result.length() - 2, result.length());
        }
        System.out.println(result.toString());

        /*Вывести на консоль значение от целочисленного деления a на b (результат - целое число)*/
        System.out.println(a / b);

        /*Вывести на консоль значение от деления a на b (результат - число с плавающей запятой)*/
        System.out.println((double) a / b);

        /*Вывести на консоль значение от деления a на b, округленного до ближайшего целого в большую сторону*/
        //System.out.println((int)Math.ceil(DoubleDivAB));
        System.out.println(Math.ceil((double) a / b));

        /*Вывести на консоль значение от деления a на b, округленного до ближайшего целого в меньшую сторону*/
        System.out.println(Math.floor((double) a / b));

        /*Вывести на консоль значение от деления a на b, округленного до ближайшего целого математическим округлением*/
        System.out.println(Math.round((double) a / b));

        /*Вывести на консоль остаток от деления b на c*/
        System.out.println(b % c);

        /*Вывести на консоль наименьшее значение из a и b*/
        System.out.println(Math.min(a, b));

        /*Вывести на консоль наибольшее значение из b и c*/
        System.out.println(Math.max(b, c));

    }
}