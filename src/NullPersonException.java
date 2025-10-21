// Claudia Garcia 3137392

// Custom exception for when a null Person is passed
public class NullPersonException extends RuntimeException {
    public NullPersonException(String message) {
        super(message); // Call parent constructor with a message
    }
}