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
                showToast(btnSpotifyStreamer);
            }
        });

        btnScoresApp = (Button) findViewById(R.id.btnScoresApp);
        btnScoresApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast(btnScoresApp);
            }
        });

        btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast(btnLibraryApp);
            }
        });

        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast(btnBuildItBigger);
            }
        });

        btnXYZReader = (Button) findViewById(R.id.btnXYZReader);
        btnXYZReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast(btnXYZReader);
            }
        });

        btnCapstone = (Button) findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast(btnCapstone);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void showToast(View view) {
        Button button = (Button) view;
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my " + button.getText() + " app!", Toast.LENGTH_SHORT);
        toast.show();
    }

}
