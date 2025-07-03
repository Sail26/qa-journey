public class ReverseString {
    public static void main(String[] args) {
        String input = "Sailaja";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}