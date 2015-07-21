package com.cookpad.android.dokumiTestAndroid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.FileOutputStream;
import java.io.IOException;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bugs
        nullDereference();
        resourceLeak();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void nullDereference() {
        Object foo = getValueRandomly();
        Log.e(TAG, foo.toString());
    }

    private Object getValueRandomly() {
        // return value could be null
        if (Math.random() < 0.1) {
            return null;
        } else {
            return new Object();
        }
    }

    private void resourceLeak() {
        byte[] arr = {1, 2, 3};
        FileOutputStream fis;
        try {
            fis = new FileOutputStream("file.txt");
            fis.write(arr);
            fis.close();
        } catch (IOException e) {
            // deal with exception
        }
    }
}
