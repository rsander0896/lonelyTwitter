package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The type Normal tweet.
 */
public class NormalTweet extends Tweet {

    /**
     * Instantiates a new Normal tweet.
     *
     * @param text the text
     * @param date the date
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet (String text, Date date) throws TweetTooLongException {
        super(text, date);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param text the text
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet (String text) throws TweetTooLongException {
        super(text);
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
