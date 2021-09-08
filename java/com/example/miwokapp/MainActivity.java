package com.example.miwokapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //set the content of the activity to use the activity main
        setContentView(R.layout.activity_main);


        //find the view that shows the number catogries
        TextView numbers = (TextView)findViewById(R.id.numbers);

        //set a onclicklistner on that view
        numbers.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //create new intent to open the {@linkActivity}
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);

                //start the new Activity
                startActivity(numbersIntent);
            }
        });


        //find the view that shows the number catogries
        TextView family = (TextView)findViewById(R.id.family);

        //set a onclicklistner on that view
        family.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //create new intent to open the {@linkActivity}
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);

                //start the new Activity
                startActivity(familyIntent);
            }
        });


        //find the view that shows the number catogries
        TextView colors = (TextView)findViewById(R.id.colors);

        //set a onclicklistner on that view
        colors.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //create new intent to open the {@linkActivity}
                Intent colorIntent = new Intent(MainActivity.this,ColorsActivity.class);

                //start the new Activity
                startActivity(colorIntent);
            }
        });


        //find the view that shows the number catogries
        TextView phrases = (TextView)findViewById(R.id.phrases);

        //set a onclicklistner on that view
        phrases.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //create new intent to open the {@linkActivity}
                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);

                //start the new Activity
                startActivity(phrasesIntent);
            }
        });

    }
}