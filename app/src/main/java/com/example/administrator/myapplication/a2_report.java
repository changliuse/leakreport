package com.example.administrator.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }

}
