package com.nawres.jeuenfant.Animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.nawres.jeuenfant.R;

public class Animal_Level2 extends AppCompatActivity {
    private RadioGroup radioShapesGroup;
    private RadioButton radioShapeButton;
    private RadioButton truth;
    private Button btnDisplay_level2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animal__level2);
        background();
        addListenerOnButton();
    }



    private void background (){
        LinearLayout level2 = findViewById(R.id.level2_animals);
        AnimationDrawable animated = (AnimationDrawable) level2.getBackground();
        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(4000);
        animated.start();
    }



    public void addListenerOnButton() {

        radioShapesGroup = findViewById(R.id.radioShapes1);
        btnDisplay_level2 = findViewById(R.id.choose);
        btnDisplay_level2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // get selected radio button from radioGroup
                int selectedId = radioShapesGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioShapeButton = findViewById(selectedId);
                truth = findViewById(R.id.radioButton1);

                if (radioShapeButton == truth) {

                    Toast.makeText(Animal_Level2.this, "True", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), Animal_Level3.class);
                    startActivity(i);

                } else {
                    Toast.makeText(Animal_Level2.this,
                            "False", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void cheat(View view) {
        Toast.makeText(Animal_Level2.this,
                "Panda", Toast.LENGTH_LONG).show();
    }
    public void levelAnimal(View view) {
        Intent l = new Intent(getApplicationContext(), animal_Level.class);
        startActivity(l);

    }
}




