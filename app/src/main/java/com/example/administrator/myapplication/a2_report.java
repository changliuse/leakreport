package com.example.administrator.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;


public class a2_report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2__report);
    }

    public void sendreportButtonClicked(View view) {
        Intent intent = new Intent(this, a2_report_respond.class);
        startActivity(intent);

        Snackbar snackbar = Snackbar
                .make(view, "Your report has been sent to KWSTF, we are looking for a plumber to fix the leaking.\\n \\nThank You!", Snackbar.LENGTH_INDEFINITE);

        snackbar.show();

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
                Intent intent= new Intent(a2_report.this, search.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.menu_about:
                Intent intent= new Intent(a2_report.this, about.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.menu_contact:
                Intent intent= new Intent(a2_report.this, contact.class);
                startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }
// Chang Liu have coded this part to open the menu items
}

