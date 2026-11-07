package ArraysAndStrings;

public class MaxValue {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 100};
        int Max = numbers[0];
        for(int number : numbers){
            if (Max<number) {
                Max = number;
                
            }
        }
        System.out.println(Max);
    }
}
