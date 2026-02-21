import java.util.Scanner;

public class Palindrome {
    static void checkPalindrome(String input) {
        boolean yes = true;
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                yes = false;
                break;
            }
        }
        System.out.println(input + " is palindrome: " + yes);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String str = sc.nextLine();
        checkPalindrome(str);
    }
}
