package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tnguyen1 on 9/20/18.
 */

public abstract class Tweet {
    protected String message;
    protected Date date;
    protected Emotion[] emotions;


    public void setMessage(String message) {

        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate(){
        return this.date;
    }

    public abstract Boolean isImportant();

    public String toString(){
        return this.date.toString() + " | " + this.message;
    }
}
