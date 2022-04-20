package hello.jdbc.repository.ex;

public class MyDBException extends RuntimeException {

    public MyDBException() {
    }

    public MyDBException(String message) {
        super(message);
    }

    // 감싸는 것이기 때문에 원인 Throwable 을 꼭 가지고 가야한다.
    public MyDBException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDBException(Throwable cause) {
        super(cause);
    }
}
