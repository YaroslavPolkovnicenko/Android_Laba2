package com.example.a21091.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "State";
    TextView txtV;
    TextView res;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(TAG, this.getLocalClassName() + " : onCreate()");

        final Intent intent = getIntent();

        String text = intent.getStringExtra("Information");

        txtV = (TextView) findViewById(R.id.textView9);
        btn = (Button) findViewById(R.id.button);
        res = (TextView) findViewById(R.id.restextview);

        txtV.setText(text);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setResult(RESULT_OK, intent);
                finish();
                Log.d(TAG, "Данные получены!");
                Toast toast = Toast.makeText(getApplicationContext(),
                        getLocalClassName() + " завершена!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        };

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
}
