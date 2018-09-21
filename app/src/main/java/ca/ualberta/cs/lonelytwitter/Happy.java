package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

/**
 * Created by tnguyen1 on 9/20/18.
 */

public class Happy extends Emotion {
    public Happy(){}
    public Happy(Date date){super(date);}

    public void mood_dependent_format(){
        Log.d("mood","I am happy");
    }
}
