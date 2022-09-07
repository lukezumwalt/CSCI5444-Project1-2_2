import support.Processor;

import java.util.Objects;

public class run {
    public static void main( String[] args ) {

        // Primary string for assigning entry.
        // Belongs to the primary run class and is passed to Processor,
        // akin to the other interim strings.
        String entry;

        while( true )
        {
            // Top of frame loop, accept input from user via terminal.
            entry = Processor.read();
            if(Objects.equals(entry, ""))
            {
                // Exit condition.
                System.out.println("Terminating...");
                break;
            }

            // Suite of Processor method calls to treat the terminal stream input.
            String cleaned = Processor.clean(entry);
            String sorted = Processor.sort(cleaned);
            String palindrome = Processor.palindrome(sorted);
            Processor.writeToFile(palindrome);

            // Print statements, included for verbose personal debugging and comprehension.
            System.out.println("ENTRY: " + entry);
            System.out.println("CLEANED: " + cleaned);
            System.out.println("SORTED: " + sorted);
            System.out.println("PALINDROME: " + palindrome);
        }
        // "Finally"-like call to close logfile
        Processor.done();
    }
}
