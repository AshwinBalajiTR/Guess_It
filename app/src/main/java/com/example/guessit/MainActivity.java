package com.example.guessit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void clickfun(View view){
        EditText a = findViewById(R.id.enter);
        int guess=Integer.parseInt(a.getText().toString());
        if(guess>randomNumber){
            Toast.makeText(MainActivity.this,guess+"ஐ விட சிறியது",Toast.LENGTH_SHORT).show();
        }
        else if(guess<randomNumber){
            Toast.makeText(MainActivity.this,guess+"ஐ விட பெரியது",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,"சரியான விடை !!! மீண்டும் ஒரு முயற்சி",Toast.LENGTH_SHORT).show();
            Random rand = new Random();
            randomNumber=rand.nextInt(20)+1;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber=rand.nextInt(50)+1;
    }
}
