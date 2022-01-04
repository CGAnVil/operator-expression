package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float width, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        width = sc.nextFloat();
        System.out.println("Nhập chiều dài: ");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("Diện tích là: " + area);


        // write your code here
    }
}
