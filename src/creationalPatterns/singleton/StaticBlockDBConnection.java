package creationalPatterns.singleton;

public class StaticBlockDBConnection {
    private static final StaticBlockDBConnection instance;

    static {
        try {
            instance = new StaticBlockDBConnection();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance", e);

        }
    }

    public static StaticBlockDBConnection getInstance() {
        return instance;
    }
}
