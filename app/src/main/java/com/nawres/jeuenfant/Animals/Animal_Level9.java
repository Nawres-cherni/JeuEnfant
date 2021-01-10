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

import com.nawres.jeuenfant.MainActivity;
import com.nawres.jeuenfant.R;

public class Animal_Level9 extends AppCompatActivity {
    private RadioGroup radioShapesGroup;
    private RadioButton radioShapeButton;
    private RadioButton truth;
    private Button btnDisplay_level9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animal__level9);
        background();
        addListenerOnButton();
    }



    private void background (){
        LinearLayout level9 = findViewById(R.id.level9_animals);
        AnimationDrawable animated = (AnimationDrawable) level9.getBackground();
        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(4000);
        animated.start();
    }



    public void addListenerOnButton() {

        radioShapesGroup = findViewById(R.id.radioShapes1);
        btnDisplay_level9 = findViewById(R.id.choose);
        btnDisplay_level9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // get selected radio button from radioGroup
                int selectedId = radioShapesGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioShapeButton = findViewById(selectedId);
                truth = findViewById(R.id.radioButton_truth);

                if (radioShapeButton == truth) {

                    Toast.makeText(Animal_Level9.this, "Congrats You have complited all the Levels", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), animal_Level.class);
                    startActivity(i);


                } else {
                    Toast.makeText(Animal_Level9.this,
                            "False", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void cheat(View view) {
        Toast.makeText(Animal_Level9.this,
                "Monkey", Toast.LENGTH_LONG).show();
    }
    public void levelAnimal(View view) {
        Intent l = new Intent(getApplicationContext(), animal_Level.class);
        startActivity(l);

    }
}



