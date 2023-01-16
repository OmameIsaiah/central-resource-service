package swipe.ng.enums;

import java.util.HashMap;
import java.util.Map;

public enum AppStatus {
    APPROVE("Approved"),
    ACTIVE("Active"),
    IN_PROGRESS("In Progress"),
    COMPLETED("Completed"),
    IN_ACTIVE("InActive"),
    CARD("Card"),

    REJECT("Rejected");


    public final String label;
    private static final Map<String, AppStatus> map = new HashMap<>();


    static {
        for (AppStatus e : values()) {
            map.put(e.label, e);
        }
    }

    private AppStatus(String label) {
        this.label = label;

    }

    public static AppStatus valueOfName(String label) {
        return map.get(label);
    }
}
