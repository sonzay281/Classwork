/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cw.calc;

/**
 *
 * @author Anonymous
 */
public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        return x / y;
    }

    public double pow(double x, double y) {
        double total = 1;
        for (int i = 1; i <= y; i++) {
            total = total * x;
        }
        return total;
    }

    public double min(double x, double y) {
        return (x < y) ? x : y;
    }

    public double max(double x, double y) {
        return (x > y) ? x : y;
    }
}
