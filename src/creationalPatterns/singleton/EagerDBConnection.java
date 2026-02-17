package creationalPatterns.singleton;

public class EagerDBConnection {
    private static final EagerDBConnection EAGER_DB_CONNECTION = new EagerDBConnection();

    private EagerDBConnection() {
    }

    public static EagerDBConnection getInstance() {
        return EAGER_DB_CONNECTION;
    }
}
