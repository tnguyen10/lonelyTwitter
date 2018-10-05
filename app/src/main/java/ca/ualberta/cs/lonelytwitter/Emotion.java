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
 * @see Happy
 * @see Sad
 */

public abstract class Emotion {

    protected Date date;

    /**
     * set the date to current date
     */
    public Emotion() {
        this.date = new Date(System.currentTimeMillis());
    }

    /**
     * @param date date for setting
     */
    public Emotion(Date date) {
        this.date = date;
    }

    /**
     * @param date date for setting
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return date of emotion
     */
    public Date getDate() {
        return this.date;
    }

    public abstract void mood_dependent_format();
}
