package com.example.controller;

import java.util.Scanner;


public class Test {
//    从键盘输入字符串，分别统计字母的个数，数字的个数，空格的个数，以及其他的个数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串: ");
        String input = scanner.nextLine();
        int letterCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int otherCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("字母个数: " + letterCount);
        System.out.println("数字个数: " + digitCount);
        System.out.println("空格个数: " + spaceCount);
        System.out.println("其他字符个数: " + otherCount);
        scanner.close();
    }
}

