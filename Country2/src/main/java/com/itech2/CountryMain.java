package com.itech2;

import com.Itech.CountryFinder;
import java.io.IOException;
import java.util.Scanner;
public class CountryMain
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CountryFinder countryFinder = new CountryFinder();
        System.out.println("Enter Country");
        String countryCode = scanner.next();
        try {
            System.out.println(countryFinder.findCountry(countryCode));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
