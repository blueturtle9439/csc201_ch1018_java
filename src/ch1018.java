import java.math.BigInteger;

/**
 * Created by mainpcHan on 2017-02-12.
 */
public class ch1018 {
    public static void main(String[] args) {


        System.out.println("The largest number in long data type is "+Long.MAX_VALUE);
        System.out.println("Five prime numbers that larger than Long.MAX_VALUE are:");
        System.out.println(bigprimes(5));
    }

    public static String bigprimes(int count) {

        BigInteger temp = BigInteger.valueOf(Long.MAX_VALUE);
        String ans = "";
        int i = 0;
        while (i < count) {
            temp = temp.nextProbablePrime();
            ans += temp.toString() + ", ";
            i++;

        }

        return ans;


    }


}
