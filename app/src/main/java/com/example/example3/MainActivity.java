package com.example.example3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity<myButton> extends AppCompatActivity {

    Button myButton = findViewById(R.id.button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //myTextView.setText("You clicked me");

                Intent i = new Intent( MainActivity.this, ChildActivity.class);
                i.putExtra("myParam", "yo soy el valor");
                i.putExtra("myInt",1);
                startActivity(i);
            }
        });
    }
}
