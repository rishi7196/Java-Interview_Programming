package Program;
import java.util.Scanner;
public class FindDigitAndNonDigit {
    public static void main(String[] args) {

            String input="2974300978200";
            StringBuilder digits = new StringBuilder();
            StringBuilder zeros = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (c == '0') {
                    zeros.append(c);
                } else {
                    digits.append(c);
                }
            }

            String output = digits.toString() + zeros.toString();
            System.out.println("Modified number: " + output);
        }
    }
