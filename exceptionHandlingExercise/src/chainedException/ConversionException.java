package chainedException;

class ConversionException extends Exception {
    public ConversionException(String message, Throwable cause) {
        super(message, cause);
    }
}
