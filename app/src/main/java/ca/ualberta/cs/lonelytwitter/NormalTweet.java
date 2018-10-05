/*
 * Copyright (c) lonelytweitter, CMPUT 301, University of Alberta - All Rights Reserved.
 */

package ca.ualberta.cs.lonelytwitter;


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


public class NormalTweet extends Tweet {
    /**
     * @return false
     */
    @Override
    public Boolean isImportant() {
        return false;
    }
}
