package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by tnguyen1 on 10/18/18.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));

        // exception check
        try {
            tweets.addTweet(tweet);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    public void testDeleteTweet() {
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(tweet.getMessage(), returnedTweet.getMessage());
        assertEquals(tweet.getDate(), returnedTweet.getDate());

    }

    public void testHasTweet() {
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        Tweet tweet2 = new NormalTweet("Tweet2");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        assertFalse(tweets.hasTweet(tweet2));
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertEquals(tweets.getCount(), 1);
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        Tweet tweet1 = new NormalTweet("Tweet1");
        tweets.addTweet(tweet1);
        Tweet tweet2 = new NormalTweet("Tweet2");
        tweets.addTweet(tweet2);
        ArrayList<Tweet> tweets2 = tweets.getTweets();

        boolean firstsecond = tweets2.get(0).getDate().before(tweets2.get(1).getDate());
        boolean secondthird = tweets2.get(1).getDate().before(tweets2.get(2).getDate());

        assertTrue(firstsecond);
        assertTrue(secondthird);
    }
}
