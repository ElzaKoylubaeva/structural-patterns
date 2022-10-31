package ru.netology.koylubaevaem;

public class Main {

    public static void main(String[] args) {

        Ints calc = new IntsCalculator();

        System.out.println(calc.sum(10, 15));
        System.out.println(calc.mult(12, 13));
        System.out.println(calc.pow(2,3));
    }
}
