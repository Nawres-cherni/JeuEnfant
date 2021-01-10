package com.nawres.jeuenfant.Shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.nawres.jeuenfant.R;

public class Shape_Level4 extends AppCompatActivity {
    private Button btnDisplay;
    private EditText choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape__level4);
        addListenerOnButton();
    }

    public void addListenerOnButton() {


        btnDisplay = findViewById(R.id.btnDisplay);
        choice = findViewById(R.id.editText3);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (choice.getText().toString().equals("square")) {
                    Toast.makeText(Shape_Level4.this, "True", Toast.LENGTH_SHORT).show();
                    Intent l = new Intent(getApplicationContext(), Shape_Level5.class);
                    startActivity(l);

                } else {
                    Toast.makeText(Shape_Level4.this,
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

