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
            Toast.makeText(MainActivity.this,"Smaller than "+guess,Toast.LENGTH_SHORT).show();
        }
        else if(guess<randomNumber){
            Toast.makeText(MainActivity.this,"Greater than "guess,Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,"The answer is correct !!!",Toast.LENGTH_SHORT).show();
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
