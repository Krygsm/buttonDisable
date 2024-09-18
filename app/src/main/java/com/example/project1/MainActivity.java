package com.example.project1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private TextView counter;
    private Button buttonDisable;
    private Button buttonCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = findViewById(R.id.counter);
        buttonDisable = findViewById(R.id.buttonDisable);
        buttonCounter = findViewById(R.id.buttonCounter);

        buttonCounter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num = counter.getText().toString()+1;

                counter.setText(String.valueOf(num));
            }
        });

        buttonDisable.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (buttonDisable.getText().toString().equals("Wyłącz"))
                {
                    buttonCounter.setEnabled(false);
                    buttonDisable.setText("Włącz");
                }
                else
                {
                    buttonCounter.setEnabled(true);
                    buttonDisable.setText("Wyłącz");
                }
            }
        });
    }
}
