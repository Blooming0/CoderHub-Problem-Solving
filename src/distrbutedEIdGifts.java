public class distrbutedEIdGifts {
    public static void main(String[] args) {
        int [] familly = {5 , 4 };
        int [] gifts = {25 , 20};
        int []result = distributeGifts(familly,gifts);
        for (int i = 0; i < familly.length; i++) {
            System.out.println(result[i]);
        }

    }
    public static int[] distributeGifts(int[] familySizes, int[] totalGifts) {

        int []giftsByFamlies = new int[familySizes.length]  ;
        for (int i = 0; i < familySizes.length ; i++) {
            giftsByFamlies[i] = totalGifts[i]/familySizes[i] ;
        }
        return giftsByFamlies;

    }

}
