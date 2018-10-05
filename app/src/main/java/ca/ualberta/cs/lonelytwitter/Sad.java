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
 * Represents a Tweet
 *
 * @author Yeva Nguyen
 * @version 1.0
 * @since: 1.0
 * @see Emotion
 * @see Happy
 */

public class Sad extends Emotion {
    /**
     * empty constructor
     */
    public Sad() {
    }

    /**
     * @param date date for setting
     */
    public Sad(Date date) {
        super(date);
    }

    /**
     * write i am sad to log
     */
    public void mood_dependent_format() {
        Log.d("mood", "I am sad");
    }
}
