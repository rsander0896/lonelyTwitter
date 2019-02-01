package ca.ualberta.cs.lonelytwitter;

/**
 * The type Tweet too long exception.
 */
public class TweetTooLongException extends Exception {

    /**
     * Instantiates a new Tweet too long exception.
     */
    TweetTooLongException() {
        super("The message is too long. Please keep tweets below 140 characters.");
    }
}
