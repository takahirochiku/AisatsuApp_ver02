package jp.techacademy.takahiro.chiku.aisatsuapp;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

import static jp.techacademy.takahiro.chiku.aisatsuapp.R.id.button2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextview;
    int hourOfDay1;
    int minute1;
    String time;
    String Say;

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
            } else if (v.getId() == button2) {
                mTextview.setText(Say);
                if (time.compareTo("02:00") >= 0 && time.compareTo("09:59") <= 0) {
                    Say = String.valueOf("「おはよう」");
                } else if (time.compareTo("10:00") >= 0 && time.compareTo("17:59") <= 0) {
                    Say = String.valueOf("「こんにちは」");
                } else if (time.compareTo("18:00") >= 0 && time.compareTo("1:59") <= 0) {
                    Say = String.valueOf("「こんばんは」");
                }
            }
        }

    private void showTimePickerDialog() {
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            hourOfDay1 = hourOfDay;
                            minute1 = minute;
                            time =String.valueOf(hourOfDay1) + ":" + String.valueOf(minute1);
                        }
                    },
                    13, // 初期値（時間）
                    0,  // 初期値（分）
                    true);
        }
    }
