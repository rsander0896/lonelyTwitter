package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The type Important tweet.
 */
public class importantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     *
     * @param text the text
     * @param date the date
     * @throws TweetTooLongException the tweet too long exception
     */
    public importantTweet(String text, Date date) throws TweetTooLongException {
        super(text, date);
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param text the text
     * @throws TweetTooLongException the tweet too long exception
     */
    public importantTweet(String text) throws TweetTooLongException {
        super(text);
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
