package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] feets = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] metters = {20, 25, 30, 35, 40, 45, 50, 55, 60, 65};
        System.out.println("Feet\t\tMetter\t|\tMetter\t\tFeet");
        System.out.println("=========================================");

        for (int i = 0; i < feets.length; i++)
        {
            System.out.printf("%2.1f\t\t\t%1.3f\t|\t%2.1f\t\t%3.3f\n", feets[i], feetToMeter(feets[i]), metters[i], meterToFeet(metters[i]));
        }
    }

    public static double feetToMeter(double feet){
        double meter = 0.305 * feet;

        return meter;
    }
    public static double meterToFeet(double meter){
        double feet = 3.279 * meter;

        return feet;
    }
}
