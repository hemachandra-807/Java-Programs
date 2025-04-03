package String_Programs;

public class PalindromeWords {
    public static void main(String[] args) {
        String s = "madam is madam";
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (isPalindrome(str[i])) {
                System.out.println(str[i]);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
