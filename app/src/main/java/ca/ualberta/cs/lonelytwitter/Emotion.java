package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tnguyen1 on 9/20/18.
 */

public abstract class Emotion {

    protected Date date;
    public Emotion(){
        this.date = new Date(System.currentTimeMillis());
    }

    public Emotion(Date date){
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate(){
        return this.date;
    }

    public abstract void mood_dependent_format();
}
