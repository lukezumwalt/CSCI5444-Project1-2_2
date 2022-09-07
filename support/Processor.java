package support;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Processor {

    // Default CTOR
    public Processor()
    {
    }

    // Terminal stream reader method.
    public static String read()
    {
        Scanner io = new Scanner( System.in );
        System.out.print("Enter a string to mess up: ");
        return io.nextLine();
    }
    // clean
    public static String clean( String s )
    {
        return s.toUpperCase();
    }
    // sort
    public static String sort( String s )
    {
        // https://www.geeksforgeeks.org/sort-a-string-in-java-2-different-ways/
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
    // palindrome
    public static String palindrome( String s )
    {
        ArrayList<Character> t = new ArrayList<>();
        char[] c = s.toCharArray();
        int len = c.length;

        //  Fill return-to-be array with inverted arg string s.
        for( int i = 0; i < len; i++ )
        {
            t.add(c[(len-1)-i]);
        }
        // Continue to fill with arg string s from pos 1->end
        // to not include the "first" letter twice.
        for( int j = 1; j < len; j++)
        {
            t.add(c[j]);
        }

        // Re-build string by appending characters from ArrayList, which was
        // used to get funky on the palindrome organization.
        StringBuilder r = new StringBuilder();
        for(Character ch: t)
        {
            r.append(ch);
        }
        return r.toString();
    }

    // File write and append sourced: https://stackoverflow.com/questions/9961292/write-to-text-file-without-overwriting-in-java
    public static void writeToFile( String s ) {
        out.append(s).append(String.valueOf('\n'));
    }

    public static void done()
    {
        out.close();
    }

    // Some file-handling members for automatic file logging.
    // I was practicing this with Java, despite it not being required.
    protected static File txt = new File( "Results2.txt" );
    protected static PrintWriter out;

    static {
        try {
            out = new PrintWriter( new FileWriter(txt, true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
