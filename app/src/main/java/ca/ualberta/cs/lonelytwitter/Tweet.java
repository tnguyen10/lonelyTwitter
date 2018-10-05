/*
 * Copyright (c) lonelytweitter, CMPUT 301, University of Alberta - All Rights Reserved.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tnguyen1 on 9/20/18.
 */

/**
 * Represents a Tweet
 *
 * @author Yeva Nguyen
 * @version 1.0
 * @since: 1.0
 * @see NormalTweet
 * @see ImportantTweet
 */

public abstract class Tweet {
    protected String message;
    protected Date date;
    protected Emotion[] emotions;


    /**
     * @param message message for setting
     */
    public void setMessage(String message) {

        this.message = message;
    }

    /**
     * @param date date for setting
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * @return individual object's notion of isImportant()
     */
    public abstract Boolean isImportant();

    /**
     * @return date and message
     */
    public String toString() {
        return this.date.toString() + " | " + this.message;
    }
}
