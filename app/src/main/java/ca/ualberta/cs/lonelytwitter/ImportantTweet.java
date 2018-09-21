package ca.ualberta.cs.lonelytwitter;

import android.text.BoringLayout;

/**
 * Created by tnguyen1 on 9/20/18.
 */

public class ImportantTweet extends Tweet {
    @Override
    public Boolean isImportant(){
        return true;
    }
}
