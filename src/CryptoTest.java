import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.stream.IntStream;

public class CryptoTest {

    @Test
    public void test(){
        Crypto crypto = new Crypto();
        IntStream val = crypto.encyrpt("Hello");
       // Assertions.assertEquals("hello",crypto.decrypt(val,new PrivateKey(,)));
       // can you solve this?
    }

}
