package com.soriano.blessie.pracexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    CheckBox s1, s2, s3, s4, s5, s6, s7, s8;
    EditText comments;
    String subjs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = findViewById(R.id.subj1);
        s2 = findViewById(R.id.subj2);
        s3 = findViewById(R.id.subj3);
        s4 = findViewById(R.id.subj4);
        s5 = findViewById(R.id.subj5);
        s6 = findViewById(R.id.subj6);
        s7 = findViewById(R.id.subj7);
        s8 = findViewById(R.id.subj8);
        comments = findViewById(R.id.comments);
    }

    public void saveData(View v) {
        String comment1 = comments.getText().toString();
        String subjs = "";
        if (s1.isChecked()) {
            subjs = subjs + s1.getText().toString()+ " ";
        }
        if (s2.isChecked()) {
            subjs = subjs + s2.getText().toString()+ " ";
        }
        if (s3.isChecked()) {
            subjs = subjs + s3.getText().toString()+ " ";
        }
        if (s4.isChecked()) {
            subjs = subjs + s4.getText().toString()+ " ";
        }
        if (s5.isChecked()) {
            subjs = subjs + s5.getText().toString()+ " ";
        }
        if (s6.isChecked()) {
            subjs = subjs + s6.getText().toString()+ " ";
        }
        if (s7.isChecked()) {
            subjs = subjs + s7.getText().toString()+ " ";
        }
        if (s8.isChecked()) {
            subjs = subjs + s8.getText().toString()+ " ";
        }
        FileOutputStream writer = null;
//                    try {
//                        writer = openFileOutput("data1.txt", MODE_PRIVATE);
//                        writer.write(data.getBytes());
//                        writer.write(data1.getBytes());
//                        writer.write(data2.getBytes());
//                        writer.write(data3.getBytes());
//                        writer.write(data4.getBytes());
//                        writer.write(data5.getBytes());
//                        writer.write(data6.getBytes());
//                        writer.write(data7.getBytes());
//                    } catch (FileNotFoundException e) {
//                        Log.d("error", "File not found...");
//                        //   e.printStackTrace();
//                    } catch (IOException e) {
//                        //   e.printStackTrace();
//                        Log.d("error", "IO error");
//                    } finally {
//                        try {
//                            writer.close();
//                        } catch (IOException e) {
//                            //  e.printStackTrace();
//                            Log.d("error", "File not found...");
//                        }
//                    }
//                    Toast.makeText(this, "Data saved..", Toast.LENGTH_LONG).show();
                }

                public void onClick(View v) {

            }

                public void next (View v){
                Intent i = new Intent(this, Screen2.class);
                startActivity(i); }

        }


