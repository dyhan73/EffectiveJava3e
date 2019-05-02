import java.math.BigInteger;
import java.util.Random;

public class S01CheckBoolean {
    public static void main(String[] args) {

        // to check code for valueOf
        boolean b = false;
        System.out.println(Boolean.valueOf(b));

        // check for probablePrime (static factory method)
        // static factory method has a name which is implicitly indicate what is it doing
        BigInteger bigInteger = BigInteger.probablePrime(256, new Random());
        System.out.println(bigInteger);

        // is BigInteger really big?
        bigInteger = new BigInteger("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"
        + "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"
        + "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"
        + "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        System.out.println(bigInteger); // yes :)



    }
}
