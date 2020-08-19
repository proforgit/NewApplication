package com.example.timepickerproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
     Button button;
     TextView textView;
     TimePickerDialog timePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textviewId);
        button=(Button)findViewById(R.id.buttonId);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          TimePicker timePicker=new TimePicker(MainActivity.this);
                                          int currenHour=timePicker.getCurrentHour();
                                          int currentMinute=timePicker.getChildCount();

                                          timePickerDialog=new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                                              @Override
                                              public void onTimeSet(TimePicker timePicker, int i, int i1) {
                                                  textView.setText(i+" : "+i1);

                                              }
                                          },currenHour,currentMinute,true);
                                      }
                                  }
        );
    }
}