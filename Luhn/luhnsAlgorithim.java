package Algorithms.Luhn;
import java.util.Scanner;
public class luhnsAlgorithim {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String myNumber=scan.nextLine();
        verifyNumber(myNumber);
    }
    public static void verifyNumber(String myNumber)
    {
        int numberDoubledResult=0;
        int numberNoChangeResult=0;
        int overallresult=0;

        for(int i = myNumber.length()-1;i>=0;i--) {
            char numNoChange=myNumber.charAt(i);
            int numberNoChange=Character.getNumericValue(numNoChange);
            numberNoChangeResult+=numberNoChange;

            i--;

            char numToDouble = myNumber.charAt(i);
            int numberDoubled = Character.getNumericValue(numToDouble);
            numberDoubled *= 2;

            if (numberDoubled > 9) {
                numberDoubled -= 9;
                numberDoubledResult += numberDoubled;
            } else if (numberDoubled <= 9) {
                numberDoubledResult += numberDoubled;
            }
        }
        overallresult=numberDoubledResult+numberNoChangeResult;
        if(overallresult%10==0) System.out.println("Number is valid");
        else System.out.println("Number is NOT valid");
    }
}


