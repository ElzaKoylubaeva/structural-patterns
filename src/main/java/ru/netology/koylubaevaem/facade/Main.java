package ru.netology.koylubaevaem.facade;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("1110", "101"));
        System.out.println(bins.mult("010", "10"));
    }
}
