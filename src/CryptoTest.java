import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.stream.IntStream;

public class CryptoTest {

    @Test
    public void test(){
        Crypto crypto = new Crypto();
        IntStream val = crypto.encyrpt("Hello");
        Assertions.assertEquals("hello",crypto.decrypt(val,new PrivateKey(2309,2311)));
        /*
        2309 and 2311 are prime numbers. THey are used as way to decrypt the data.
        The public key contains a non-prime which is a multiplication of the above 2 prime numbers 5336099
        Typically the public key (non-prime) would be a very large number and it would require a very fast computer to arrive at
        the prime numbers required for a private key.
         */
    }

}
