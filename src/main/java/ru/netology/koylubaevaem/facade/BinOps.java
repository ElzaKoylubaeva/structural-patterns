package ru.netology.koylubaevaem.facade;

import java.nio.charset.StandardCharsets;

public class BinOps {

    public String sum(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int sum = intA + intB;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int multiplication = intA * intB;
        return Integer.toBinaryString(multiplication);
    }
}
