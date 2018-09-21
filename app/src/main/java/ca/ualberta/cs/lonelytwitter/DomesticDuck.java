package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

/**
 * Created by tnguyen1 on 9/20/18.
 */

public class DomesticDuck extends Animal implements FlyingBehaviour{
    public DomesticDuck(String type, String food){
        super(type,food);
    }
    public void swim(){
        Log.d("cmput301","I love to swim");
    }
    public void doesLikeFlying(){
        Log.d("cmput301","No, I fly only when a cat attacks me");
    }
}
