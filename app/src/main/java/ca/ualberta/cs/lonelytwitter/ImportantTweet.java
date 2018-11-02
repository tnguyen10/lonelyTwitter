/*
 * Copyright (c) lonelytweitter, CMPUT 301, University of Alberta - All Rights Reserved.
 */

package ca.ualberta.cs.lonelytwitter;


/**
 * Created by tnguyen1 on 9/20/18.
 */

/**
 * Represents a ImportantTweet
 *
 * @author Yeva Nguyen
 * @version 1.0
 * @since: 1.0
 * @see NormalTweet
 * @see ImportantTweet
 */

public class ImportantTweet extends Tweet {
    /**
     * @return true
     */
    @Override
    public Boolean isImportant() {
        return true;
    }
}
