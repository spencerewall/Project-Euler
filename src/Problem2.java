/**
 * Created with IntelliJ IDEA.
 * User: spencerewall
 * Date: 8/6/13
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem2 {
    public static void printFibsUpTo(int max) {
        int a = 0;
        int b = 1;
        while (b<max) {
            int temp = b;
            b = b+a;
            a = b;
            System.out.println(b);
        }
    }
    public static int sumEvenFibsUpTo(int max) {
        int a = 0;
        int b = 1;
        int sum = 0;
        while (b<=max) {
            b = b+a;
            a = b-a;
            if (b%2==0) {
                sum+=b;
                System.out.print(b+" ");
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumEvenFibsUpTo(4000000));
    }
}
