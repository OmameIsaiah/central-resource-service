package swipe.ng.enums;

import java.util.HashMap;
import java.util.Map;

public enum AppStatus {
    /**
     * <pre>
     * APPROVE
     * Label=Approved
     * </pre>
     */
    APPROVE("Approved"),
    /**
     * <pre>
     * ACTIVE
     * Label=Active
     * </pre>
     */
    ACTIVE("Active"),
    /**
     * <pre>
     * IN PROGRESS
     * Label=In Progress
     * </pre>
     */
    IN_PROGRESS("In Progress"),
    /**
     * <pre>
     *COMPLETED
     * Label=Completed
     * </pre>
     */
    COMPLETED("Completed"),
    /**
     * <pre>
     * INACTIVE
     * Label=InActive
     * </pre>
     */
    IN_ACTIVE("InActive"),
    /**
     * <pre>
     * CARD
     * Label=Card
     * </pre>
     */
    CARD("Card"),
    /**
     * <pre>
     * REJECTED
     * Label=Rejected
     * </pre>
     */
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
