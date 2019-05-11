package com.box;

import java.util.Scanner;

public class BoxTester {

    public static void main(String[] args) {
        float length;
        float width;
        int height;

        Box3 box3 = new Box3();
        Box5 box5 = new Box5();

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入寄送物品\"長度\"");
        length = scanner.nextFloat();

        System.out.println("請輸入寄送物品\"寬度\"");
        width = scanner.nextFloat();

        System.out.println("請輸入寄送物品\"高度\"");
        height = scanner.nextInt();

        if (box5.validate(length,width,height)){
            if (box3.validate(length,width,height)) {
                System.out.println("可放入Box3盒子");
            } else {
                System.out.println("可放入Box5盒子");
            }
        } else {
            System.out.println("沒有合適的盒子!");
        }
    }
}
