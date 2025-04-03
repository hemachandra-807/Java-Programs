package String_Programs;

public class LowToUpper {
    public static void main(String[] args) {
        System.out.println(convert("call uaas"));
    }

    public static String convert(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
        }
        return new String(ch);
    }
}
