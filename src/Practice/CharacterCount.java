package Practice;

public class CharacterCount {

    public static String countCharacters(String input) {
        StringBuilder output = new StringBuilder();

        // Initialize count to 1 since there is at least one character
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                // If the current character is the same as the previous one, increment count
                count++;
            } else {
                // If the current character is different from the previous one,
                // append the previous character and its count to the output
                output.append(input.charAt(i - 1));
                output.append(count);
                // Reset count to 1 for the new character
                count = 1;
            }
        }

        // Append the last character and its count to the output
        output.append(input.charAt(input.length() - 1));
        output.append(count);

        return output.toString();

    }

    public static void main(String[] args) {
        String input = "AABCCCA";
        String output = countCharacters(input);
        System.out.println("Output: " + output);  // Output: A2B1C3A1
    }
}

