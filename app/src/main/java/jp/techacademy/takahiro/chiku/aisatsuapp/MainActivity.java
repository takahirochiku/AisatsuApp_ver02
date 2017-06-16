package jp.techacademy.takahiro.chiku.aisatsuapp;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.util.Log;
import java.sql.Time;

import static jp.techacademy.takahiro.chiku.aisatsuapp.R.id.button2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextview;
    int hourOfDay1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        mTextview = (TextView) findViewById(R.id.textView);

    }
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.button1) {
                showTimePickerDialog();
            } else if (v.getId() == R.id.button2) {
                if (hourOfDay1>2&&hourOfDay1<10){
                    mTextview.setText(String.valueOf("「おはよう」"));
                } else if (hourOfDay1>10&&hourOfDay1<18){
                    mTextview.setText(String.valueOf("「こんにちは」"));
                } else if (hourOfDay1>10||hourOfDay1<2){
                    mTextview.setText(String.valueOf("「こんばんは」"));
                }
            }
        }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                        public void onTimeSet(TimePicker view, int hourOfDay) {
                            hourOfDay1 = hourOfDay;
                        }
                    },
                    13, // 初期値（時間）
                    0,  // 初期値（分）
                    true);
        timePickerDialog.show();
        }
    }
