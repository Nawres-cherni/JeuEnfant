package com.nawres.jeuenfant.Shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.nawres.jeuenfant.MainActivity;
import com.nawres.jeuenfant.R;

public class Shape_Level9 extends AppCompatActivity {
    private RadioGroup radioShapesGroup;
    private RadioButton radioShapeButton;
    private RadioButton truth;
    private Button btnDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape__level9);
        addListenerOnButton();

    }

    public void addListenerOnButton() {

        radioShapesGroup = findViewById(R.id.radioShapes1);
        btnDisplay = findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioShapesGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioShapeButton = findViewById(selectedId);
                truth = findViewById(R.id.radioHexagon);

                if (radioShapeButton == truth) {
                    Toast.makeText(Shape_Level9.this, "True.. Congrats you have completed all the levels", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);

                } else {
                    Toast.makeText(Shape_Level9.this,
                            "False", Toast.LENGTH_LONG).show();
                }
            }

        });

    }
    public void levelShape(View view) {
        Intent l = new Intent(getApplicationContext(), shapes_levels.class);
        startActivity(l);

    }
    public void help(View view) {
        Intent l = new Intent(getApplicationContext(), cheatSheet.class);
        startActivity(l);

    }

}

