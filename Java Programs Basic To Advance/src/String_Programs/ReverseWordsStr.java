package String_Programs;

public class ReverseWordsStr {
 public static void main(String[] args) {
     String s = "java is easy";
     System.out.println(rev(s));
 }

 public static String rev(String s) {
     String temp = "";
     for (int i = s.length() - 1; i >= 0; i--) {
         temp += s.charAt(i);
     }
     return temp;
 }
}

