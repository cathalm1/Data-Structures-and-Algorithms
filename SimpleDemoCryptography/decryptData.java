package SimpleDemoCryptography;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.lang.String;

class decryptData {
    static String decryptDataData(byte[] encryptionOfData, String myKey) throws Exception
    {
        String newDataDecryption="";

        try
        {
            SecretKeySpec numbern=new SecretKeySpec(myKey.getBytes(),"AES");
            Cipher c=Cipher.getInstance("AES");
            c.init(Cipher.DECRYPT_MODE,numbern);
            newDataDecryption=new String(c.doFinal(encryptionOfData));
        }
        catch (Exception e)
        {
            //e.printStackTrace();

            //throw new Exception(e);
            newDataDecryption="";
        }

        return newDataDecryption;
    }
}
