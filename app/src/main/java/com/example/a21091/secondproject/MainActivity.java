package com.example.a21091.secondproject;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "State";
    private  Notebook notebook = new Notebook();
    private Menu menu;
    EditText manufact;
    EditText diagonal;
    EditText time;
    EditText cost;
    TextView about;
    TextView text;
    TextView txtV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, this.getLocalClassName() + " : onCreate()");

        manufact = (EditText) (findViewById(R.id.Manufacturer));
        diagonal = (EditText) (findViewById(R.id.Diagonal));
        time = (EditText) (findViewById(R.id.Time));
        cost = (EditText) (findViewById(R.id.Cost));
        about = (TextView) (findViewById(R.id.About));
        text = (TextView) (findViewById(R.id.textView));
        txtV = (TextView) (findViewById(R.id.restextview));
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

    @Override
    public boolean onCreateOptionsMenu(final Menu menu){

        this.menu = menu;

        menu.add(0, 0, 0, "Вторая активность").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String m = manufact.getText().toString();
                String di = diagonal.getText().toString();
                double d = Double.parseDouble(di);
                String ti = time.getText().toString();
                int t = Integer.parseInt(ti);
                String ci = cost.getText().toString();
                int c = Integer.parseInt(ci);

                notebook.Add(notebook.New(m, d, t, c));

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                intent.putExtra("Information",m + "\n\n\n" + d + " \n\n\n" + " " + t);

                startActivity(intent);

                return true;
            }
        });

        menu.add(0, 1, 1, "Третья активность").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String m = manufact.getText().toString();
                String di = diagonal.getText().toString();
                double d = Double.parseDouble(di);
                String ti = time.getText().toString();
                int t = Integer.parseInt(ti);
                String ci = cost.getText().toString();
                int c = Integer.parseInt(ci);

                notebook.Add(notebook.New(m, d, t, c));

                Intent intent = new Intent("GotThirdActivity");

                intent.putExtra("Main",m + "\n\n\n" + d + " \n\n\n" + " " + t);
                intent.putExtra("Dop", c + "");

                startActivityForResult(intent, 2);

                return true;
            }
        });

        menu.add(0, 2, 2, "Четвёртая активность").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String m = manufact.getText().toString();
                String di = diagonal.getText().toString();
                double d = Double.parseDouble(di);
                String ti = time.getText().toString();
                int t = Integer.parseInt(ti);
                String ci = cost.getText().toString();
                int c = Integer.parseInt(ci);

                notebook.Add(notebook.New(m, d, t, c));

                Intent intent = new Intent("GotFourthActivity");

                intent.putExtra("Main", m + "\n\n\n" + d + " \n\n\n" + " " + t);
                intent.putExtra("Dop", c + "");

                startActivityForResult(intent, 2);

                return true;
            }
        });

        menu.add(0, 3, 3, "Пятая активность").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String m = manufact.getText().toString();
                String di = diagonal.getText().toString();
                double d = Double.parseDouble(di);
                String ti = time.getText().toString();
                int t = Integer.parseInt(ti);
                String ci = cost.getText().toString();
                int c = Integer.parseInt(ci);

                notebook.Add(notebook.New(m, d, t, c));

                Intent intent = new Intent("GotFifthActivity");

                intent.putExtra("Main", m + "\n\n\n" + d + " \n\n\n" + " " + t);
                intent.putExtra("Dop", c + "");

                startActivityForResult(intent, 2);

                return true;
            }
        });

                return super.onCreateOptionsMenu(menu);
    }
}
