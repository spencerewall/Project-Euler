/**
 * Created with IntelliJ IDEA.
 * User: spencerewall
 * Date: 8/6/13
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem4 {
    public static long largestPalindromeProduct(int digits)
    {
        String str = "1";
        for (int i = 1; i<digits; i++) {
            str += "0";
        }
        long min = Long.parseLong(str);
        long max = min*10-1;
        min = min * min;
        max = max * max;

        while (min<=max) {
            if (isPalindrome(max))
                if (isDigitDivisible(digits, max))
                    return max;
            max--;
        }
        return -1;
    }

    public static boolean isPalindrome(long num) {
        String numStr = ""+num;
        for (int i = 0 ; i<=numStr.length()-i ; i++) {
            if (numStr.charAt(i)!=numStr.charAt(numStr.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDigitDivisible(int digits, long num) {
        String str = "1";
        for (int i = 1; i<digits; i++) {
            str += "0";
        }

        long i = Long.parseLong(str);
        long max = i*10;
        while (i<max) {
            if (num%i == 0) {
                long j = num/i;
                if ((""+j).length()==digits)
                    return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(largestPalindromeProduct(3));
    }
}
