package arraysandstrings;

public class MaxValue {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 100};
        int maxValue = numbers[0];
        for(int number : numbers){
            if (maxValue < number) {
                maxValue = number;
                
            }
        }
        System.out.println(maxValue);
    }
}
