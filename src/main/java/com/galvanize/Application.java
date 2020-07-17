package com.galvanize;

public class Application {

//    boolean isActive(String status) {
//        if (status.equals("active")) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    char grade(int input) {
        if (input >= 90) {
            return 'A';
        } else if (input >= 80) {
            return 'B';
        } else if (input >= 70) {
            return 'C';
        } else if (input >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }


    public static void main(String[] args) {
        Application template = new Application();
        System.out.println("hello world");
//        System.out.println(isActive("Active"));
//        System.out.println(isActive("active"));
        System.out.println(template.grade(Integer.parseInt(args[0])));

        System.out.println();


    }

}