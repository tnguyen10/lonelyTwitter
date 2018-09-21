package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

/**
 * Created by tnguyen1 on 9/20/18.
 */

public abstract class Animal {
    protected String type;
    protected String food;

    public Animal(String type, String food){
        this.type = type;
        this.food = food;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setFood(String food){
        this.food = food;
    }
    public String getType(){
        return this.type;
    }
    public String getFood(){
        return this.food;
    }

    public abstract void swim();
}
