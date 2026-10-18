public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Print all elements 
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        //Calculate the sum of all elements
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of the array elements is: " + sum);

        // Calculate the average of all elements
        double average = (double) sum / numbers.length;
        System.out.printf("The average of the array elements is: %.2f%n", average);

        // Find the maximum and minimum elements

        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);

        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}