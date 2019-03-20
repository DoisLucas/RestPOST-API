package tecworld.doislucas.services.exceptions;

public class EmailDuplicatedException extends RuntimeException {

    public EmailDuplicatedException(String msg) {
        super(msg);
    }

    public EmailDuplicatedException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
