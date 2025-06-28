import java.util.regex.*;
public class PostfixOperationHARD {
    public static void main(String[] args) {
        System.out.println(postFix("10 1 + 11 /"));

    }
    public static int postFix(String expr) {

        String nums = "0123456789";
        String []numsAndOperationsWithoutSpaces = new String[expr.length() - 1];
        int counter = 0 ;
        //حفظ الارقام مع العمليات بدون التعديل على الترتيب ولكن بازالة المسافات
        for (int i = 0; i < expr.length(); i++) {
            if(expr.charAt(i) == ' '){
                continue;

            }else {
                    if(expr.charAt(i) == '+' || expr.charAt(i) == '-' || expr.charAt(i) == '*' || expr.charAt(i) == '/' ){
                        numsAndOperationsWithoutSpaces[counter++] = String.valueOf(expr.charAt(i));
                    }else {
                        if(expr.charAt(i) >= '0' &&  expr.charAt(i) <= '9' && expr.charAt(i+1) == ' '){
                            numsAndOperationsWithoutSpaces[counter++] = String.valueOf(expr.charAt(i));
                        }else if(expr.charAt(i) >= '0' &&  expr.charAt(i) <= '9' && expr.charAt(i+1) != ' '){
                            String numberFromTwoDigit = expr.charAt(i)+""+expr.charAt(i+1);
                            numsAndOperationsWithoutSpaces[counter++] = numberFromTwoDigit;
                            i++;
                    }
                }

            }
        }
        for (int i = 0; i < numsAndOperationsWithoutSpaces.length - 1; i++) {
            if(("+").equals(numsAndOperationsWithoutSpaces[i+1]) || ("-").equals(numsAndOperationsWithoutSpaces[i+1]) ||("*").equals(numsAndOperationsWithoutSpaces[i+1]) ||("/").equals(numsAndOperationsWithoutSpaces[i+1])){
                String temp = numsAndOperationsWithoutSpaces[i];
                numsAndOperationsWithoutSpaces[i] = numsAndOperationsWithoutSpaces[i+1];
                numsAndOperationsWithoutSpaces[i+1] = temp;
            }
        }
        int result = 0;
        for (int i = 0; i < numsAndOperationsWithoutSpaces.length - 1; i++) {

            if(numsAndOperationsWithoutSpaces[i].equals("+")){
                result += Integer.parseInt(numsAndOperationsWithoutSpaces[i + 1]) + Integer.parseInt(numsAndOperationsWithoutSpaces[i - 1]);
                i = i+2;
            }else if(numsAndOperationsWithoutSpaces[i].equals("-")){
                result += Integer.parseInt(numsAndOperationsWithoutSpaces[i + 1]) - Integer.parseInt(numsAndOperationsWithoutSpaces[i - 1]);
                i = i+2;
            }else if(numsAndOperationsWithoutSpaces[i].equals("*")){
                result += Integer.parseInt(numsAndOperationsWithoutSpaces[i + 1]) * Integer.parseInt(numsAndOperationsWithoutSpaces[i - 1]);
                i = i+2;
            }else if(numsAndOperationsWithoutSpaces[i].equals("/")){
                result += Integer.parseInt(numsAndOperationsWithoutSpaces[i + 1]) / Integer.parseInt(numsAndOperationsWithoutSpaces[i - 1]);
                i = i+2;
            }else if(numsAndOperationsWithoutSpaces[i] == null){
                break;
            }
        }
        return result ;
    }


}
