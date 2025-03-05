// TelcoAllowance.java (Implementation of UsagePromo)
public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, int dataGB, double money) {
        return telcoName + " offers data at " + dataGB + "GB of data having a ₱" + money + " price";
    }
}
