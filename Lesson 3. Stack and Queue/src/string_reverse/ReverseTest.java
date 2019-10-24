package string_reverse;

import java.util.Scanner;
import java.util.Stack;

/**
 * class for flipping input lines (read from right to left)
 *
 * @author holnievvitalii@outlook.com
 * @version dated Oct 04, 2019
 */

public class ReverseTest {
    private static String s;

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input string: ");
            s = scanner.nextLine();
            System.out.println("Your inverted string: " + reverseByStack(s));
        }
    }

    /**
     * the method flips the input lines (reads from right to left)
     *
     * @param s
     * @return
     */
    private static String reverseByStack(String s) {
        Stack<Character> st = new Stack<>();
        for (Character character : s.toCharArray()) {
            st.add(character);
        }
        StringBuilder sb = new StringBuilder();
        while (st.size() > 0) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}

