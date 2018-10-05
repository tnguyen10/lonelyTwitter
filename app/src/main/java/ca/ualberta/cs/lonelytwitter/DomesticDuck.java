/*
 * Copyright (c) lonelytweitter, CMPUT 301, University of Alberta - All Rights Reserved.
 */

package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

/**
 * Created by tnguyen1 on 9/20/18.
 */

/**
 * Represents a Tweet
 *
 * @author Yeva Nguyen
 * @version 1.0
 * @since: 1.0
 * @see Animal
 * @see Cat
 */

public class DomesticDuck extends Animal implements FlyingBehaviour {
    /**
     * @param type type of animal
     * @param food food of animal
     */
    public DomesticDuck(String type, String food) {
        super(type, food);
    }

    /**
     * write i love to swim to log
     */
    public void swim() {
        Log.d("cmput301", "I love to swim");
    }

    /**
     * write no, ifly when a cat attacks me to log
     */
    public void doesLikeFlying() {
        Log.d("cmput301", "No, I fly only when a cat attacks me");
    }
}
