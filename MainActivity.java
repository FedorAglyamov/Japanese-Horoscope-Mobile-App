package com.theatomicpineapple.japanesehoroscope;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class MainActivity extends AppCompatActivity {
    public final static String MONTH = "com.theatomicpineapple.JapaneseHoroscope.MONTH";
    public final static String DATE = "com.theatomicpineapple.JapaneseHoroscope.DATE";
    public final static String YEAR = "com.theatomicpineapple.JapaneseHoroscope.YEAR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        // Set up layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
    }

    // Analyze birthday passed by user
    public void sendBDay(View view){
        
        // Get birthday passed by user
        Intent intent = new Intent(this, JapaneseHoroscope.class);
        EditText month = (EditText) findViewById(R.id.month);
        EditText date = (EditText) findViewById(R.id.date);
        EditText year = (EditText) findViewById(R.id.year);
        
        // Store birthday date
        String months = month.getText().toString();
        String dates = date.getText().toString();
        String years = year.getText().toString();
        
        // Send birthday to be translated into horoscope
        Bundle extras = new Bundle();
        extras.putString(MONTH, months);
        extras.putString(DATE, dates);
        extras.putString(YEAR, years);
        intent.putExtras(extras);
        startActivity(intent);
        
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
            Intent intent = new Intent(this, Translation.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
