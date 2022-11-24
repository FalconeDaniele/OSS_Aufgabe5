package de.hfu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(in.toUpperCase());
        sc.close();
    }
}
