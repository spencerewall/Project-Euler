/**
 * Created with IntelliJ IDEA.
 * User: spencerewall
 * Date: 8/6/13
 * Time: 9:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem3 {
    public static long getLargestPrimeFactor(long num) {
        return primeFactorHelper(num, 2);
    }

    public static long primeFactorHelper(long num, long current) {
        long p = 1;
        if (num%current==0) {
            System.out.print(current+" ");
            p = current;
            num = num/current;
        }
        else
            current++;

        if (current>=num)
            return num/p;
        else
            return Math.max(primeFactorHelper(num, current), p);
    }
    public static void main(String[] args) {
        System.out.println(getLargestPrimeFactor(600851475143L));
    }
}
