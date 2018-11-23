/*
 * Copyright (c) lonelytweitter, CMPUT 301, University of Alberta - All Rights Reserved.
 */

package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import static ca.ualberta.cs.lonelytwitter.PermissionRequest.verifyPermission;

/**
 * Represents a LonelyTwitterActivity
 *
 * @author Yeva Nguyen
 * @version 1.0
 * @since: 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweet
 */

public class LonelyTwitterActivity extends Activity {

    Uri imageFileUri;
    private static final String FILENAME = "file.sav";
    private EditText bodyText;
    private ListView oldTweetsList;
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private ArrayAdapter<Tweet> adapter;


    /**
     * Called when the activity is first created.
     * Get save button, clear button, list views
     * Save and append user input of text into tweet list
     * Clear tweet list
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bodyText = (EditText) findViewById(R.id.body);
        Button saveButton = (Button) findViewById(R.id.save);
        oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);
        Button clearButton = (Button) findViewById(R.id.clear);

        saveButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String text = bodyText.getText().toString();
                ImportantTweet newTweet = new ImportantTweet();
                newTweet.setMessage(text);
                newTweet.setDate(new Date());
                tweets.add(newTweet);
                adapter.notifyDataSetChanged();
                saveInFile();


            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tweets.clear();
                adapter.notifyDataSetChanged();
            }
        });

        ImageButton button = (ImageButton) findViewById(R.id.TakeAPhoto);
        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View v){
                takeAPhoto();
            }
        };
        button.setOnClickListener(listener);
    }

    /**
     * load from file
     * set oldTweetsList to an adapter
     * adapter outputs list of tweets
     */
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        loadFromFile();
        adapter = new ArrayAdapter<Tweet>(this,
                R.layout.list_item, tweets);
        oldTweetsList.setAdapter(adapter);
    }

    private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;

    public void takeAPhoto() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        String folder = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download";
        File folderF = new File(folder);
        if (!folderF.exists()) {
            folderF.mkdir();
        }

        //if(Build.VERSION.SDK_INT>=16) {
        try {
            Method m = StrictMode.class.getMethod("disableDeathOnFileUriExposure");
            m.invoke(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //}

        verifyPermission(this);

        String imageFilePath = folder + "/" + String.valueOf(System.currentTimeMillis()) + "jpg";

        File imageFile = new File(folder,"imagetest.jpg");
        imageFileUri = Uri.fromFile(imageFile);

        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageFileUri);
        startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE) {
            TextView tv = (TextView) findViewById(R.id.status);
            if (resultCode == RESULT_OK) {
                tv.setText("Photo OK!");
                ImageButton button = (ImageButton) findViewById(R.id.TakeAPhoto);
                button.setImageDrawable(Drawable.createFromPath(imageFileUri.getPath()));
            } else if (resultCode == RESULT_CANCELED) {
                tv.setText("Photo canceled");
            } else {
                tv.setText("Not sure what happened!" + resultCode);
            }
        }
    }

    /**
     * Open file input stream using gson
     * Read from file into tweets list
     */
    private void loadFromFile() {
        try {
            FileInputStream fis = openFileInput(FILENAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr);
            Gson gson = new Gson();
            Type listTweetType = new TypeToken<ArrayList<ImportantTweet>>() {
            }.getType();
            tweets = gson.fromJson(reader, listTweetType);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            tweets = new ArrayList<Tweet>();
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Open file output stream using gson
     * Write to files tweets list
     */
    private void saveInFile() {
        try {
            FileOutputStream fos = openFileOutput(FILENAME, 0);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter writer = new BufferedWriter(osw);
            Gson gson = new Gson();
            gson.toJson(tweets, writer);
            writer.flush();
            fos.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}