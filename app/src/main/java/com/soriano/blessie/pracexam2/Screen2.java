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

    //TextView subjs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        FileInputStream reader1 = null;
        FileInputStream reader2 = null;
        String msg1 = "";
        String msg2 = "";
            try {
                int token;
                reader1 = openFileInput("data1.txt");
                reader2 = openFileInput("data2.txt");
                while ((token = reader1.read()) != -1){
                    msg1 = msg1 + (char)token;
                }
                while((token = reader2.read()) != -1){
                    msg2 = msg2+ (char)token;
                }
                reader1.close();
                reader2.close();
                try {
                    ((TextView) (findViewById(R.id.subjs))).setText(msg1);
                    ((TextView) (findViewById(R.id.comments))).setText(msg2);
                } catch(Exception e){

                }
            } catch (FileNotFoundException e) {
                //  e.printStackTrace();
                Log.d("error", "File not found..");
            } catch (IOException e) {
                Log.d("error", "IO error..");
                //  e.printStackTrace();
            }
        //    Toast.makeText(this, msg1.toString(), Toast.LENGTH_LONG).show();
       //     Toast.makeText(this, msg2.toString(), Toast.LENGTH_LONG).show();
        }


    public void send(View v){
        Toast.makeText(this, "Request sent..", Toast.LENGTH_LONG).show();
    }

    public void goBack(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
