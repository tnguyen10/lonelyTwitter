/*
 * Copyright (c) lonelytweitter, CMPUT 301, University of Alberta - All Rights Reserved.
 */

package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

/**
 * Created by tnguyen1 on 9/20/18.
 */

/**
 * Represents a Happy
 *
 * @author Yeva Nguyen
 * @version 1.0
 * @since: 1.0
 * @see Emotion
 * @see Sad
 */


public class Happy extends Emotion {
    /**
     * happy constructor
     */
    public Happy() {
    }

    /**
     * @param date date for setting
     */
    public Happy(Date date) {
        super(date);
    }

    /**
     * write i am happy to log
     */
    public void mood_dependent_format() {
        Log.d("mood", "I am happy");
    }
}
