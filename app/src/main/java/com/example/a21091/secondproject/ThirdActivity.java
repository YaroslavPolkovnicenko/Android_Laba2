package com.example.a21091.secondproject;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private static final String TAG = "State";
    Button btn;
    TextView main;
    TextView dop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Log.d(TAG, this.getLocalClassName() + " : onCreate()");

        main = (TextView) findViewById(R.id.About);
        dop = (TextView) findViewById(R.id.textView6);
        btn = (Button) findViewById(R.id.button3);

        final Intent intent = getIntent();

        String mainA = intent.getStringExtra("Main");
        String dopA = intent.getStringExtra("Dop");

        main.setText(mainA);
        dop.setText(dopA);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                back();
            }
        });
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.d(TAG, this.getLocalClassName() + " : onStart()");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d(TAG, this.getLocalClassName() + " : onResume()");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d(TAG, this.getLocalClassName() + " : onPause()");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d(TAG, this.getLocalClassName() + " : onStop()");
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.d(TAG, this.getLocalClassName() + " : onDestroy()");
    }
    private void back(){

        final String[] list = {"Слабая", "Умеренная", "Сильная"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Степень заинтересованности?");

        builder.setSingleChoiceItems(list, -1, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent intent = new Intent();

                intent.putExtra("str", "Степень заинтересованности: "+list[which]);

                Log.d(TAG, "Заинтересованность " + list[which]);

                setResult(RESULT_OK, intent);

                finish();
                Toast toast = Toast.makeText(getApplicationContext(),
                        getLocalClassName() + " завершена со степенью заинтересованности: " + list[which], Toast.LENGTH_SHORT);
                toast.show();

            }

        });

        builder.setCancelable(false);

        builder.create().show();
    }
}
