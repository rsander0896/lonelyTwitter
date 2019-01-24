package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class importantTweet extends Tweet {

    public importantTweet(String text, Date date) throws TweetTooLongException {
        super(text, date);
    }

    public importantTweet(String text) throws TweetTooLongException {
        super(text);
    }

    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
