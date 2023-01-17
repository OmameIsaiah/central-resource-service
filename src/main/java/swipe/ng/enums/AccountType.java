package swipe.ng.enums;

import java.util.HashMap;
import java.util.Map;

public enum AccountType {
    /**
     * <pre>
     * USER
     * AccountId=2, Label=USER
     * </pre>
     */
    USER(2, "USER"),
    /**
     * <pre>
     * ACCOUNT
     * AccountId=9, Label=ACCOUNT
     * </pre>
     */
    ACCOUNT(9, "ACCOUNT"),
    /**
     * <pre>
     * ADMINISTRATOR
     * AccountId=4, Label=ADMINISTRATOR
     * </pre>
     */
    ADMINISTRATOR(4, "ADMINISTRATOR"),
    /**
     * <pre>
     * MERCHANT
     * AccountId=6, Label=MERCHANT
     * </pre>
     */
    MERCHANT(6, "MERCHANT"),
    /**
     * <pre>
     * SUPPORT
     * AccountId=8, Label=SUPPORT
     * </pre>
     */
    SUPPORT(8, "SUPPORT"),
    /**
     * <pre>
     * SUPPER USER
     * AccountId=7, Label=SUPPER USER
     * </pre>
     */
    SUPPER_USER(7, "SUPPER USER"),
    /**
     * <pre>
     * COLLECTOR AGENT
     * AccountId=11, Label=COLLECTOR AGENT
     * </pre>
     */
    COLLECTOR(11, "COLLECTOR AGENT"),
    /**
     * <pre>
     * BANK
     * AccountId=5, Label=BANK
     * </pre>
     */
    BANK(5, "BANK"),
    /**
     * <pre>
     * DISBURSEMENT
     * AccountId=10, Label=DISBURSEMENT
     * </pre>
     */
    DISBURSEMENT(10, "DISBURSEMENT");




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
        this.label = label;

    }

    public static AccountType valueOfName(String label) {
        return map.get(label);
    }
}
