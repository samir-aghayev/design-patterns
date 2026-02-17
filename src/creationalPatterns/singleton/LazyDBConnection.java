package creationalPatterns.singleton;

public class LazyDBConnection {
    private static LazyDBConnection instance;

    private LazyDBConnection() {
    }

    public static LazyDBConnection getInstance() {
        if (instance == null) instance = new LazyDBConnection();
        return instance;
    }
}
