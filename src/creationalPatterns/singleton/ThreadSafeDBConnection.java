package creationalPatterns.singleton;

public class ThreadSafeDBConnection {
    private static ThreadSafeDBConnection instance;

    private ThreadSafeDBConnection() {
    }

    //synchronized keyword-ü thread safe üçün tətbiq edilir
    public static synchronized ThreadSafeDBConnection getInstance() {
        if (instance == null) instance = new ThreadSafeDBConnection();
        return instance;
    }

}
