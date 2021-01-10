package com.nawres.jeuenfant.Animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.nawres.jeuenfant.R;
import com.nawres.jeuenfant.Shapes.shapes_levels;

public class Animal_Level1 extends AppCompatActivity {

    private RadioGroup radioShapesGroup;
    private RadioButton radioShapeButton;
    private RadioButton truth;
    private Button btnDisplay_level1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal__level1);
        background();
        addListenerOnButton();
    }


    private void background (){
        LinearLayout level1 = findViewById(R.id.level1_animals);
        AnimationDrawable animated = (AnimationDrawable) level1.getBackground();
        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(4000);
        animated.start();
    }

    public void addListenerOnButton() {

        radioShapesGroup = findViewById(R.id.radioShapes1);
        btnDisplay_level1 = findViewById(R.id.choose);
        btnDisplay_level1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // get selected radio button from radioGroup
                int selectedId = radioShapesGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioShapeButton = findViewById(selectedId);
                truth = findViewById(R.id.radioButton);

                if (radioShapeButton == truth) {

                    Toast.makeText(Animal_Level1.this, "True", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), Animal_Level2.class);
                    startActivity(i);

                } else {
                    Toast.makeText(Animal_Level1.this,
                            "False", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    public void levelAnimal(View view) {
        Intent l = new Intent(getApplicationContext(), animal_Level.class);
        startActivity(l);

    }
    public void cheat(View view) {
        Toast.makeText(Animal_Level1.this,
                "Hippopotamus", Toast.LENGTH_LONG).show();
    }

}




