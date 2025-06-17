import java.util.*;
public class Chardigits {
    public static boolean containsDigit(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = sin.nextLine();

        if (containsDigit(a)) {
            System.out.println("Contains digit.");
        } else {
            System.out.println("Does not contain digit.");
        }
    }
}
