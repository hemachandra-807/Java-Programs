package EasyWayToDoPatterns;

public class AlternatingPattern {

    public static void main(String[] args) {
        int num = 5; // Number of rows

        // Loop through rows
        for (int i = 1; i <= num; i++) {
            // Determine the starting number for the row
            int start = (i % 2 == 0) ? 0 : 1;

            // Loop to print the alternating numbers for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                // Toggle between 1 and 0
                start = (start == 1) ? 0 : 1;
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
