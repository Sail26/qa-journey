public class EvenOddFromArray {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 7, 8, 9};

        System.out.println("Even numbers:");
        for (int n : numbers) {
            if (n % 2 == 0) System.out.println(n);
        }

        System.out.println("Odd numbers:");
        for (int n : numbers) {
            if (n % 2 != 0) System.out.println(n);
        }
    }
}