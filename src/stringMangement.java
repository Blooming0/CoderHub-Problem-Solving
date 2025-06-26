public class stringMangement {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("lello world!"));  // Example test
    }

    public static int firstUniqChar(String s) {
        int[] count = new int[256]; // ASCII character frequency array

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1; // If no unique character
    }

}
