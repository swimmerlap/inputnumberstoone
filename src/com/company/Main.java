package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter a number:  ");
        int input = keyboard.nextInt();


        for (int index = input; index >= 1; index--)

        {
            System.out.println(index);
        }


    }

}
























