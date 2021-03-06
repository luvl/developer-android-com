package com.example.pickerfortime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTimePicker(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time_msg));
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        String hour_string = Integer.toString(hourOfDay);
        String min_string = Integer.toString(minute);
        String dateMessage = (hour_string +
                ":" + min_string);

        Toast.makeText(this, getString(R.string.time_) + dateMessage,
                Toast.LENGTH_SHORT).show();
    }
}
