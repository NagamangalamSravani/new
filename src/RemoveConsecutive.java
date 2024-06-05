public class RemoveConsecutive {
    public static void main(String[] args) {
        String input = "aaabbccddeee";
        String result = removeConsecutive(input);
        System.out.println("Original string: " + input);
        System.out.println("String after removing consecutive characters: " + result);
    }

    public static String removeConsecutive(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            result.append(current);

            // Skip consecutive characters
            while (i < input.length() - 1 && input.charAt(i + 1) == current) {
                i++;
            }
        }

        return result.toString();
    }
}
