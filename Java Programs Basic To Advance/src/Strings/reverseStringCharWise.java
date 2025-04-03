public class reverseStringCharWise {
    
    public static void main(String[] args) {
        
        String s = "Welcome to java";

        String reversedStr = new StringBuilder(s).reverse().toString();

        System.out.println(reversedStr);
    }
}
