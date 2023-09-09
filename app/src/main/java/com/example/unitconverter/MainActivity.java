package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button = findViewById(R.id.button);
         editText = findViewById(R.id.editText);
         textView = findViewById(R.id.textView);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String inputText = editText.getText().toString();
                 //Converting string to double//
                 double kilos = Double.parseDouble(inputText);

                 //converting kilos into pounds___
                 double pounds = makeConversion(kilos);

                 textView.setText(""+pounds);

             }
         });



        
    }
    public double makeConversion(double kilos){
        return kilos*2.20462;
    }

    }
