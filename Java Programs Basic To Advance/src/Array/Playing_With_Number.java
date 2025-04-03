public class Playing_With_Number {

    static int[] ShiftArray(int input1, int[] input2, int input3) {
        
        for(int i=0;i<input3;i++)
        {
            int fisrt = input2[0],j;
            for(j=0;j<input2.length-1;j++)
            {
                input2[j] = input2[j+1];
            }
            input2[j] = fisrt;
        }
        return input2;
    }
    
    public static void main(String[] args) {
        int[] input2 = {1, 2, 3, 4, 5, 6, 7};
        int input3 = 2;
        int[] output = ShiftArray(input2.length, input2, input3);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
    
}
    

