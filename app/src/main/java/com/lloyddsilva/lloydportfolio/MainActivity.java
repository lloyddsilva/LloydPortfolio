package com.lloyddsilva.lloydportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button btnSpotifyStreamer;
    Button btnScoresApp;
    Button btnLibraryApp;
    Button btnBuildItBigger;
    Button btnXYZReader;
    Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSpotifyStreamer = (Button) findViewById(R.id.btnSpotifyStreamer);
        btnSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnScoresApp = (Button) findViewById(R.id.btnScoresApp);
        btnScoresApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Scores app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Library app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnXYZReader = (Button) findViewById(R.id.btnXYZReader);
        btnXYZReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnCapstone = (Button) findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Capstone app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
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
}
