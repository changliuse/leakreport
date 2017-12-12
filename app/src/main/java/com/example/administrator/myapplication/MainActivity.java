package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);
    }
    // Chang Liu have coded this part to open the menu items
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.b1_register_form, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_search:
            Intent intent= new Intent(MainActivity.this, search.class);
            startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.menu_about:
                Intent intent= new Intent(MainActivity.this, about.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.menu_contact:
                Intent intent= new Intent(MainActivity.this, contact.class);
                startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }
// Chang Liu have coded this part to open the menu items

    public void login(View view) {
    }

    public void reportButtonClicked(View view) {
        Intent intent = new Intent(this, a2_report.class);
        startActivity(intent);

    }
}

