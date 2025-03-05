// UnliCallTextPackage.java (Implementation of UnliCallTextOffer)
public class UnliCallTextPackage implements UnliCallTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " Unlimited Calls & Texts: " + (unliCallText ? "Yes" : "No");
    }
}
