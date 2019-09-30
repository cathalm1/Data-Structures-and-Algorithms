package SimpleDemoCryptography;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

class privateKeyGen {

    static KeyPair privateKeyGenGen() throws NoSuchAlgorithmException {
        KeyPairGenerator kg=KeyPairGenerator.getInstance("RSA");
        SecureRandom sr = new SecureRandom();
        kg.initialize(2048);
        KeyPair myKey=kg.generateKeyPair();
        System.out.println(myKey);
        return myKey;
    }
}
