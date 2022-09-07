import support.Processor;

import java.util.Objects;

public class run {
    public static void main( String[] args ){

//        Processor treater = new Processor();

        String entry;

        while( true )
        {
            // call reader, continue or not?
            entry = Processor.read();
            if(Objects.equals(entry, ""))
            {
                // Exit condition
                System.out.println("Terminating...");
                break;
            }
            System.out.println("ENTRY: " + entry );
            String cleaned = Processor.clean(entry);
            System.out.println("CLEANED: " + cleaned );
            String sorted = Processor.sort(cleaned);
            System.out.println("SORTED: " + sorted);
            String palindromed = Processor.palindrome(sorted);
            System.out.println("PALINDROME: " + palindromed);

        }



    }
}
