package creationalPatterns.singleton;

public class DoubleCheckedLockingDBConnection {

    /**
     * sürəti artırmaq üçün bəzən dəyişənin dəyərləri cache-dən oxuna bilər. volatile keyword ilə işarələnmiş field isə
     * dəyərini cache-dən yox birbaşa əsas yaddaşdan yazıb və əsas yaddaşdan oxuyur.
     */
    private static volatile DoubleCheckedLockingDBConnection instance;

    private DoubleCheckedLockingDBConnection() {
    }

    public static DoubleCheckedLockingDBConnection getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingDBConnection.class) {
                if (instance == null) instance = new DoubleCheckedLockingDBConnection();
            }
        }
        return instance;
    }
}
