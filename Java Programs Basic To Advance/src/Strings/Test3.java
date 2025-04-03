import java.util.Arrays;
import java.util.Comparator;

public class Test3 {

    public static void main(String[] args) {
        String[] str = {"Banana", "Orange", "Grape", "Mango", "Apple"};

        Arrays.sort(str, new SecondCharacterComparator());

        System.out.println(Arrays.toString(str));
    }
}

class SecondCharacterComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        char c1 = s1.charAt(1); 
        char c2 = s2.charAt(1);

        return Character.compare(Character.toLowerCase(c1), Character.toLowerCase(c2));
    }
}
