package Javalearn;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("名字");
        String name = scan.nextLine();
        System.out.println("年龄");
        int age = scan.nextInt();
        System.out.println(name + age);

    }
}
