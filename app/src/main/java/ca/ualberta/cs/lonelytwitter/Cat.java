/*
 * Copyright (c) lonelytweitter, CMPUT 301, University of Alberta - All Rights Reserved.
 */

package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

/**
 * Created by tnguyen1 on 9/20/18.
 */

/**
 * Represents a Cat
 *
 * @author Yeva Nguyen
 * @version 1.0
 * @since: 1.0
 * @see Animal
 * @see DomesticDuck
 */

public class Cat extends Animal {
    /**
     * @param type type of animal
     * @param food food of animla
     */
    public Cat(String type, String food) {
        super(type, food);
    }

    /**
     * write i hate to swim to log
     */
    public void swim() {
        Log.d("cmput301", "I hate to swim");
    }
}
