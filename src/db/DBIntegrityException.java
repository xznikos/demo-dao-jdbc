package db;

public class DBIntegrityException extends RuntimeException {
    public DBIntegrityException(String mgs) {
        super(mgs);
    }
}
