package SimpleDemoCryptography;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.lang.String;

class encryptData {

    static byte[] encryptDataData(String data, String myKey) throws Exception
    {
        byte[] encryptedData;

        try
        {
            SecretKeySpec numbern=new SecretKeySpec(myKey.getBytes(),"AES");
            Cipher c=Cipher.getInstance("AES");
            c.init(Cipher.ENCRYPT_MODE,numbern);
             encryptedData=c.doFinal(data.getBytes("UTF-8"));
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        return encryptedData;
    }
}
