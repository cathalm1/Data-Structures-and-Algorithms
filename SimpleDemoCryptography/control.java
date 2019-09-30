package SimpleDemoCryptography;

public class control {
    public static void main(String args[]) throws Exception {
        bankDetails one = new bankDetails();
        encryptData two = new encryptData();
        decryptData three = new decryptData();
        privateKeyGen four=new privateKeyGen();
        byte[] encryptionOfData = two.encryptDataData(one.getDataString(), one.getMyKey());
        System.out.println("DATA  SUCCESSFULLY  ENCRYPTED");
        //System.out.println(encryptionOfData);

        String decryptionComplete = three.decryptDataData(encryptionOfData,one.getMyKey());


        if(decryptionComplete.length()==0)
        {
            System.out.println("INCORRECT KEY");
        }
        else
        {
            System.out.println("DATA  SUCCESSFULLY  DECRYPTED");
            System.out.println(decryptionComplete);
        }

        four.privateKeyGenGen();
    }
}
//[B@7fac631b