package com.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextScanner  {
    public static void main(String[] args) throws InputMismatchException {
        TextScanner textScanner = new TextScanner();
        textScanner.findInLineUSE();
    }

    public void findInLineUSE(){
        String string = "a b c d e f g h i j k l m n o p q r s t u v w x y z 1 2 3 4 5 6 7 8 9 0";
        Scanner scanner1 = new Scanner(string); // scanner扫描器指向string
        System.out.println(scanner1.findInLine("fghi")); //返回scanner扫描器中的fghi字符串
        System.out.println(scanner1.findInLine("f g h i")); //返回scanner扫描器中的f g h i字符串
        System.out.println(scanner1.hasNext());

        Scanner scanner2 = new Scanner(System.in);
        System.out.println(scanner2.findInLine("jjf")); //返回标准输入流中的jjf字符串
        System.out.println(scanner2.hasNextLine());
        //System.out.println(scanner2.findInLine("01 2")); //返回标准输入流中的jjf字符串
    }

}
