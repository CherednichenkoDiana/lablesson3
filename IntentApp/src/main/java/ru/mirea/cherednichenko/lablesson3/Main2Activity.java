package ru.mirea.cherednichenko.lablesson3;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView textView = findViewById(R.id.textView);

        Bundle arguments = getIntent().getExtras();
        String TEXT = arguments.get("time").toString();
        textView.setText(TEXT);
    }
    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
