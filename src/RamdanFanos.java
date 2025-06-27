public class RamdanFanos {
    public static void main(String[] args) {
        int []brightness = {-1, -2, -3};
        System.out.println(maxBrightnessPeriod(brightness));
    }
    public static int maxBrightnessPeriod(int[] brightness) {
        int currentSum = brightness[0];
        int maxSum = brightness[0];

        for (int i = 1; i < brightness.length; i++) {
            // إذا الجمع السابق سلبي، نبدأ من الجديد
            if (currentSum < 0) {
                currentSum = brightness[i];
            } else {
                currentSum = currentSum + brightness[i];
            }
            System.out.println("hello wordl!");
            // إذا المجموع الحالي أكبر من أعلى مجموع، نحدثه
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

}
