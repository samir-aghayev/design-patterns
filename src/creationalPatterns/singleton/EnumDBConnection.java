package creationalPatterns.singleton;

public enum EnumDBConnection {
    DB_CONNECTION;

    EnumDBConnection() {
        System.out.println("DB Connection created");
    }
}
