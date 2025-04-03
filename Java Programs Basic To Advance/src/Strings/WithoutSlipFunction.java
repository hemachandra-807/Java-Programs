public class WithoutSlipFunction {

    public static void main(String[] args) {
        String input = "apple banana orange grape";

        int startIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                System.out.println(input.substring(startIndex, i));
                startIndex = i + 1;
            }
        }
        System.out.println(input.substring(startIndex));
    }
}
