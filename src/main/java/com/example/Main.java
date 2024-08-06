package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SelectInput select = new SelectInput(scanner.nextInt());
        scanner.close();
    }
}
