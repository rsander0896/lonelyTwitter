package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Class Tweet
 * <p>
 * Version 1.0.0
 * <p>
 * January 23, 2019
 * <p>
 * Copyright
 */
public abstract class Tweet implements iTweetable {
    private String text; // The string
    /**
     * The Date.
     */
    protected Date date;

    /**
     * Instantiates a new Tweet.
     *
     * @param tweet : String containing the body of the tweet
     * @param date  :
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet (String tweet, Date date) throws TweetTooLongException {
        this.setDate(date);
        this.setText(tweet);
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param tweet the tweet
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet (String tweet) throws TweetTooLongException {
        this.setText(tweet);
        this.date = new Date();
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText () {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text : String type parameter
     * @throws TweetTooLongException : If tweet too long it occurs
     */
    public void setText (String text) throws TweetTooLongException {
        if (text.length() <= 140){
            this.text = text;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate () {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate (Date date) {
        this.date = date;
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    /**
     * To string string.
     *
     * @return the string
     */
    public String toString () {
        return date.toString() + " | ";
    }

}
