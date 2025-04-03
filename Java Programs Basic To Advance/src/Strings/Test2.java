import java.util.Arrays;

public abstract class Test2 
{

	public static void main(String[] args) {
		String[] str = { "Banana", "Orange", "Grape", "Mango", "Apple" };

		int size = str.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {

				if (str[i].compareToIgnoreCase(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
}