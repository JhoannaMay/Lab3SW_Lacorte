// Telco.java (Concrete Class implementing TelcoSubscription)
public class Telco implements TelcoSubscription {
    private String telcoName;
    private int dataAllowance; // GB
    private double promoPrice; // Price in PHP
    private boolean unliCallText; // Unlimited Calls & Texts (true/false)

    public Telco(String telcoName, int dataAllowance, double promoPrice, boolean unliCallText) {
        this.telcoName = telcoName;
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }
}
