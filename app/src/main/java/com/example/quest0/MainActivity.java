package com.example.quest0;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button[] choices = new Button[3];
    TextView Text, HRM;
    Story story;
    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        choices[0] = findViewById(R.id.button1);
        choices[1] = findViewById(R.id.button2);
        choices[2] = findViewById(R.id.button3);
        for(Button b: choices){
            b.setOnClickListener(this);
        }
        HRM = findViewById(R.id.text1);
        Text = findViewById(R.id.text2);
        player = new Player("name");
        story = new Story(this);
        Text.setText(story.current_situation.text);
    }


    @Override
    public void onClick(View v) {
        int choice = 0;
        if(v.getId() == R.id.button1)
            choice = 1;
        if(v.getId() == R.id.button2)
            choice = 2;
        if(v.getId() == R.id.button3)
            choice = 3;
        player.Health += story.current_situation.dHealth;
        player.Respect += story.current_situation.dRespect;
        player.Money += story.current_situation.dMoney;
        HRM.setText("Здоровье:" + player.Health + "    Репутация:" + player.Respect + "    Деньги:" + player.Money);
        if (story.isEnd()) {
            return;
        }
        story.go(choice);
        Text.setText(story.current_situation.text);
    }
}