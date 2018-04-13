package edu.android.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     

    private Button button;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        TextView textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        textView.setText("GitHub");
    }
}
