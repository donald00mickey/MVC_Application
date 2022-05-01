package com.example.mvcapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        textView = findViewById ( R.id.textView );
        button = findViewById ( R.id.button );
        button.setOnClickListener ( view -> {
            textView.setText ( MyModel ().getName () );
        } );
    }

    public MyModel MyModel() {
        return new MyModel ( "Hello" );
    }
}