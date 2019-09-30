package SimpleDemoCryptography;

class bankDetails
{
    private String cardNumber;
    private String cvv;
    private String expireDate;
    private String nameCard;
    private String cardType;
    private String data;

    bankDetails()
    {
        cardNumber="1234123412341234";
        cvv="888";
        expireDate="20/01/18";
        nameCard="kanye west";
        cardType="visa";
    }
    private bankDetails(String cardNumber,String cvv,String expireDate,String nameCard,String cardType)
    {
        this.cardNumber=cardNumber;
        this.cvv=cvv;
        this.expireDate=expireDate;
        this.nameCard=nameCard;
        this.cardType=cardType;
    }
    private String getCardNumber()
    {
        return cardNumber;
    }
    private String getCvv()
    {
        return cvv;
    }
    private String getexpireDate()
    {
        return expireDate;
    }
    private String getnameCard()
    {
        return nameCard;
    }
    private String getcardType()
    {
        return cardType;
    }
    String getDataString()
    {
        data = getCardNumber() + " "+ getCvv() + " " + getexpireDate() + " " + getnameCard() + " "+ getcardType();
        return data;
    }
    String getMyKey()
    {
        String myKey="8EB00A30861863A6B40553A5DA8C43DF";
        return myKey;
    }
}
