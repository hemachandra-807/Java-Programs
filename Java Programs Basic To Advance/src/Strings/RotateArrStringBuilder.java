public class RotateArrStringBuilder {

    public static void main(String[] args) {
        int data = 25143;
        int key = 3;

        int rotatedInt = rotateInteger(data, key);

        System.out.println(rotatedInt);
    }

    public static int rotateInteger(int data, int key) {
        String dataStr = Integer.toString(data);

        StringBuilder result = new StringBuilder();
        int len = dataStr.length();

        key = key % len;

        result.append(dataStr.substring(key)).append(dataStr.substring(0, key));

        int answer = Integer.parseInt(result.toString());
        return answer;
    }
}
