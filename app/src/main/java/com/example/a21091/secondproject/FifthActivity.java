package com.example.a21091.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {

    private static final String TAG = "State";
    RadioButton main;
    RadioButton dop;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        Log.d(TAG, this.getLocalClassName() + " : onCreate()");

        main = (RadioButton) findViewById(R.id.radioButton);
        dop = (RadioButton) findViewById(R.id.radioButton2);
        back = (Button) findViewById(R.id.button7);

        final Intent intent = getIntent();

        String mainA = intent.getStringExtra("Main");
        String dopA = intent.getStringExtra("Dop");

        main.setText(mainA);
        dop.setText(dopA);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setResult(RESULT_OK, intent);
                finish();
                Log.d(TAG, "Данные получены!");
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Радио активность " + getLocalClassName() + " завершена!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    public void CheckRadioBtnMain(View view){
             dop.setChecked(false);
    }

    public void CheckRadioBtnDop(View view){
        /*if(main.isChecked() == true){
            dop.setChecked(false);
        } else if(dop.isChecked() == true){
            main.setChecked(false);
        }*/
        main.setChecked(false);
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
}
