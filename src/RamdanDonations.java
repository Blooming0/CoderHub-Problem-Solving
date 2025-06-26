public class RamdanDonations {
    public static void main(String[] args) {

    }
    public static int findDonationTargetDay(double[] donations, double target) {
       double sum = 0;
       int dayCounter = 0 ;
        for (int i = 0; i < donations.length; i++) {
            sum += donations[i];
            dayCounter++;
            if(sum >= target){
                return dayCounter;
            }
        }
        return -1;
    }

}
