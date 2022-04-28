package hello.jdbc.repository.ex;

// DB에서 발생한 Exception 이라는 것을 알 수 있다.
public class MyDuplicateKeyException extends MyDBException {

    public MyDuplicateKeyException() {
    }

    public MyDuplicateKeyException(String message) {
        super(message);
    }

    public MyDuplicateKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDuplicateKeyException(Throwable cause) {
        super(cause);
    }
}
