package com.nawres.jeuenfant.Colors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.nawres.jeuenfant.R;

public class Color_Level2 extends AppCompatActivity {
    private Button btnDisplay;
    private EditText choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color__level2);
        addListenerOnButton();
        background();
    }

    private void background (){
        LinearLayout level1 = findViewById(R.id.color_layout);
        AnimationDrawable animated = (AnimationDrawable) level1.getBackground();
        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(4000);
        animated.start();
    }


    public void addListenerOnButton() {
        btnDisplay = findViewById(R.id.btnDisplay);
        choice = findViewById(R.id.choice);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (choice.getText().toString().equals("black")) {
                    Toast.makeText(Color_Level2.this, "True", Toast.LENGTH_SHORT).show();
                    Intent l = new Intent(getApplicationContext(), Color_Level3.class);
                    startActivity(l);

                } else {
                    Toast.makeText(Color_Level2.this,
                            "False", Toast.LENGTH_LONG).show();
                }
            }

        });

    }
    public void levelColor(View view) {
        Intent l = new Intent(getApplicationContext(), color_levels.class);
        startActivity(l);

    }
    public void help(View view) {
        Intent l = new Intent(getApplicationContext(),  CheatColor.class);
        startActivity(l);}


}
