package com.soriano.blessie.pracexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Screen2 extends AppCompatActivity {

    TextView subjs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        subjs = findViewById(R.id.subjs);

        FileInputStream reader = null;
        String msg = "";
        StringBuffer msg = null;
            try {
                int token;
                msg = new StringBuffer();
                FileInputStream reader = openFileInput("data1.txt");
                while ((token = reader.read()) != -1){
                    msg.append((char)token);
                }
            } catch (FileNotFoundException e) {
                //  e.printStackTrace();
                Log.d("error", "File not found..");
            } catch (IOException e) {
                Log.d("error", "IO error..");
                //  e.printStackTrace();
            }
            Toast.makeText(this, msg.toString(), Toast.LENGTH_LONG).show();
        }


    public void send(View v){
        Toast.makeText(this, "Request sent..", Toast.LENGTH_LONG).show();
    }

    public void goBack(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
