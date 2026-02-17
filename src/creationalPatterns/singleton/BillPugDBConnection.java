package creationalPatterns.singleton;

public class BillPugDBConnection {
    private BillPugDBConnection() {
    }

    private static final class BillPugDBConnectionHelper {
        private static final BillPugDBConnection INSTANCE = new BillPugDBConnection();
    }

    public static BillPugDBConnection getInstance() {
        return BillPugDBConnectionHelper.INSTANCE;
    }
}
