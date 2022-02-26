
import java.util.stream.IntStream;

public class Crypto {

    public IntStream encyrpt(String message) {
        return message.toLowerCase().chars().map(i->(int)i*PublicKey.getKey());
    }

    public String decrypt(IntStream stream,PrivateKey key) {
        int np = key.getPf1() * key.getPf2();

        String decrypted= stream.map(i->(int)i/np).collect(
                StringBuilder::new,
                (sb, i) -> sb.append((char)i),
                StringBuilder::append
        ).toString();

        return decrypted;
    }

}