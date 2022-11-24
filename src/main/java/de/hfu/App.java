package de.hfu;

import java.util.Scanner;

/**
 * Class containing the main function
 *
 */
public class App 
{
    /**
     * Reads a line from the terminals
     * outputs the line in caps
     * @param args emtpy
     */
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(in.toUpperCase());
        sc.close();
    }
}
