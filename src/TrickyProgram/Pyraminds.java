package TrickyProgram;

public class Pyraminds {

    public static void main(String[] args) {

        int row = 6;

        for (int i = 1; i <= row; i++) {
            // Print spaces
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print(" 1");
            }

            // Move to next line
            System.out.println();
        }
    }
}
