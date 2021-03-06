package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class b1_register_respond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1_register_respond);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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
                Intent intent= new Intent(b1_register_respond.this, search.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.menu_about:
                Intent intent= new Intent(b1_register_respond.this, about.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.menu_contact:
                Intent intent= new Intent(b1_register_respond.this, contact.class);
                startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }
    // Chang Liu have coded this part to open the menu items
    public void openmyprofle(View view) {
    }
}
