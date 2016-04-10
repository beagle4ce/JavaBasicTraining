package exceptions;

public class MyOwnException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public MyOwnException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MyOwnException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    public MyOwnException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public MyOwnException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public MyOwnException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

}
