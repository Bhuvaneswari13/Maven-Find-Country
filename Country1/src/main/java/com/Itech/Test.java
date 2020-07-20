package com.Itech;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        CountryFinder countryFinder = new CountryFinder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter CountryCode");
        String countryCode = scanner.next();
        System.out.println(countryFinder.findCountry(countryCode));

    }
}
