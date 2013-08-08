/**
 * Created with IntelliJ IDEA.
 * User: spencerewall
 * Date: 8/6/13
 * Time: 8:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem1 {
    public static int sumMultiplesUpTo(int mult, int max) {
        //Subtracting 1 from max makes sure that calculations are performed below the desired value
        max--;
        double equationCount = (max/mult) / 2.0;
        int maxMult = (max/mult) * mult;
        return (int) ((mult + maxMult) * equationCount);
    }

    public static int sumManyMultiplesUpTo(int mult1, int mult2, int max) {
        int sum = sumMultiplesUpTo(mult1, max);
        sum += sumMultiplesUpTo(mult2, max);
        sum -= sumMultiplesUpTo(mult1*mult2, max);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumManyMultiplesUpTo(3, 5, 1000));
    }
}
