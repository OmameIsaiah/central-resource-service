package swipe.ng.enums;

import java.util.HashMap;
import java.util.Map;

public enum ActivationType {
    /**
     * <pre>
     * WALLET
     * Label=Wallet
     * </pre>
     */
    WALLET("Wallet"),
    /**
     * <pre>
     * ACCOUNT
     * Label=Account
     * </pre>
     */
    ACCOUNT("Account");


    public final String label;
    private static final Map<String, ActivationType> map = new HashMap<>();


    static {
        for (ActivationType e : values()) {
            map.put(e.label, e);
        }
    }
    private ActivationType(String label) {
        this.label=label;

    }
    public static ActivationType valueOfName(String label) {
        return map.get(label);
    }
}
