package support;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Processor {

    // read
    public static String read() {
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

        //  Fill return-to-be with inverted sample string.
        for( int i = 0; i < len; i++ )
        {
            t.add(c[(len-1)-i]);
        }
        // Continue to fill with sample string from pos 1->end
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
}
