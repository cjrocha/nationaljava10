/** This is my first ever code on Java
 * Using SDK 17
 * Module to calculate sum of first 100 no. greater than 0
 */

package com.unpontdev;

public class Maths {
    public static void main(String[] args) {
        int no = 100, sum = 0;
        for (int i = 1; i <= 100; ++i) {
            //adding i to sum
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
