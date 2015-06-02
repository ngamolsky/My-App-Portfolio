package com.example.nikitagamolsky.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
// The next portion of code calls the onClick part of each button in the main activity xml.
    public void toast1(View view) {
        String text = "This will launch the Spotify Streamer";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(getApplicationContext(), text , duration).show();
    }

    public void toast2(View view) {
        String text = "This will launch the Scores App";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(getApplicationContext(), text , duration).show();
    }

    public void toast3(View view) {
        String text = "This will launch the Library App";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(getApplicationContext(), text , duration).show();
    }

    public void toast4(View view) {
        String text = "This will launch the Build it Bigger";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(getApplicationContext(), text , duration).show();
    }

    public void toast5(View view) {
        String text = "This will launch the XYZ Reader";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(getApplicationContext(), text , duration).show();
    }

    public void toast6(View view) {
        String text = "This will launch the My Own App";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(getApplicationContext(), text , duration).show();
    }
}
