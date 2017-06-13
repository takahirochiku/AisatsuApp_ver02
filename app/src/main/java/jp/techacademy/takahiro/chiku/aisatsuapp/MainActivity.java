package jp.techacademy.takahiro.chiku.aisatsuapp;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int hourOfDay1;
    int mitune1;
    String Adress;
    TextView mTextview;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);

        @Override
        public void onClick(View v){
            if (v.getId() == R.id.button1) {
                showTimePickerDialog();
            } else if (v.getId() == R.id.button2) {
                 //if
                 //上記の中でさらにifを加えていく、、、、
                mTextview.setText();

            }
        }
    }
    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                         hourOfDay1 = hourOfDay;
                         mitune1 = minute;
                    }
                },
                13, // 初期値（時間）
                0,  // 初期値（分）
                true);
             }
    
             @Override
    public void onClick(View v) {
        mTextView.setText(hourOfDay1);
    }

    }
