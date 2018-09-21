package ca.ualberta.cs.lonelytwitter;


/**
 * Created by tnguyen1 on 9/20/18.
 */

public class NormalTweet extends Tweet {
    @Override
    public Boolean isImportant(){
        return false;
    }
}
