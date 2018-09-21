package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

/**
 * Created by tnguyen1 on 9/20/18.
 */

public class Cat extends Animal{
    public Cat(String type, String food){
        super(type,food);
    }
    public void swim(){
        Log.d("cmput301","I hate to swim");
    }
}
