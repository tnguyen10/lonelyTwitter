/*
 * Copyright (c) lonelytweitter, CMPUT 301, University of Alberta - All Rights Reserved.
 */

package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

/**
 * Created by tnguyen1 on 9/20/18.
 */

/**
 * Represents a Animal
 *
 * @author Yeva Nguyen
 * @version 1.0
 * @since: 1.0
 * @see Cat
 * @see DomesticDuck
 */

public abstract class Animal {
    protected String type;
    protected String food;


    /**
     * @param type type of animal
     * @param food food of animal
     */
    public Animal(String type, String food) {
        this.type = type;
        this.food = food;
    }

    /**
     * @param type type of animal
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param food food of animal
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * @return type of animal
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return food of animal
     */
    public String getFood() {
        return this.food;
    }

    /**
     * check if animal likes to swim or not
     */
    public abstract void swim();
}
