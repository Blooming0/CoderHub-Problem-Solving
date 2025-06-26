public class calculateSaudiFlagScoreX {
    public static void main(String[] args) {
        String[] h = {"Green", "Palm"};
        int result = calculateSaudiFlagScore(h);
        System.out.println(result);
    }

    public static int calculateSaudiFlagScore(String[] elements) {
        String[] grades = {"Green", "Sword", "Arabic Calligraphy", "Palm"};
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals("Green")) {
                sum += 10;
            } else if (elements[i].equals("Sword")) {
                sum += 15;
            } else if (elements[i].equals("Arabic Calligraphy")) {
                sum += 20;
            } else if (elements[i].equals("Palm")) {
                sum += 5;
            } else {
                sum += 0; // Optional, default is already 0
            }

        }
        return sum;
    }
}
