package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyConverter(View view) {
        Log.i("Info", "Button Pressed");
        EditText editText = (EditText) findViewById(R.id.editText);
        String amountInPounds = editText.getText().toString();
        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        double amountInDollarsDouble = amountInPoundsDouble * 1.3;
        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this, "£" + amountInPounds + "is $" + amountInDollarsString, Toast.LENGTH_LONG).show();
        Log.i("Info",editText.getText().toString());
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}