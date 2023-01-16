package swipe.ng.enums;

import java.util.HashMap;
import java.util.Map;

public enum AccountType {
    USER(2,"USER"),
    ACCOUNT(9,"ACCOUNT"),
    ADMINISTRATOR(4,"ADMINISTRATOR")
    ,MERCHANT(6,"MERCHANT"),
    SUPPORT(8,"SUPPORT"),
    SUPPER_USER(7,"SUPPER USER"),
    COLLECTOR(11,"COLLECTOR AGENT"),
    BANK(5,"BANK"),
    DISBURSEMENT(10,"DISBURSEMENT");

    public final Integer accountId;
    public final String label;
    private static final Map<String, AccountType> map = new HashMap<>();


    static {
        for (AccountType e : values()) {
            map.put(e.label, e);
        }
    }
    private AccountType(Integer accountId, String label) {
        this.accountId = accountId;
        this.label=label;

    }
    public static AccountType valueOfName(String label) {
        return map.get(label);
    }
}
