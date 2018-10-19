package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by tnguyen1 on 10/18/18.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {
        if (tweets.contains(tweet) == false) {
            tweets.add(tweet);
        } else {
            throw new IllegalArgumentException("tweets already contain this tweet");
        }
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }



    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public int getCount() {
        return tweets.size();
    }

    // sort date from assignment 1
    public class DateCompare implements Comparator<Tweet> {
        @Override
        public int compare(Tweet t1, Tweet t2) {
            return t1.getDate().compareTo(t2.getDate());
        }
    }

    public ArrayList<Tweet> getTweets(){
        Collections.sort(tweets, new DateCompare());
        return tweets;
    }
}
