/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cw;

import com.leapfrog.cw.calc.Calculator;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class MainMenu {
    private double total=0;

    public void menu() {
        
        double x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        x = input.nextInt();
        System.out.print("Enter second number:");
        y = input.nextInt();
        System.out.println("1.Add \t 2.Sub \t 3.Mul \t 4.Div");
        System.out.println("5.Pow \t 6.Min \t 7.Max \t 8.Exit");
        System.out.println("Choose the operation:");
        int option = input.nextInt();
        calculation(total, x, y, option);
    }

    public void calculation(double total, double x, double y, int option) {
       Calculator calc=new Calculator();
        while (true) {
            switch (option) {
                case 1:
                    total =calc.add(x,y);
                    break;
                case 2:
                    total = calc.sub(x,y);
                    break;
                case 3:
                    total = calc.mul(x,y);
                    break;
                case 4:
                    total = calc.div(x,y);
                    break;
                case 5:
                    total =calc.pow(x, y);
                    break;
                case 6:
                  total=calc.min(x,y);
                    break;
                case 7:
                    total=calc.max(x,y);

                    break;
                case 8:
                    System.exit(0);
                    break;

            }
            Scanner input = new Scanner(System.in);
            System.out.println("Output:" + total);
            System.out.println("Do you want to continue?[Y/N]");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(1);
            } else {
                menu();
            }
            
        }

    }
}
