package com.nawres.jeuenfant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.nawres.jeuenfant.Animals.animal_Level;
import com.nawres.jeuenfant.Colors.color_levels;
import com.nawres.jeuenfant.Numbers.numbers_levels;
import com.nawres.jeuenfant.Shapes.shapes_levels;

public class MainActivity extends AppCompatActivity {
    Button animalsList,colorsList,shapesList,numbersList;

    TextView name_kid;
    Button btn__logout;
    SharedPreferences sharedPreferences;
    private static  final String Shared_Pref_Name="mypref";
    private static  final String KEY_NAME="name";
    private static  final String KEY_EMAIL="email";
    private static  final String KEY_PASSWORD="password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        name_kid=findViewById(R.id.txt);
        btn__logout=findViewById(R.id.btnlogout);
        sharedPreferences=getSharedPreferences(Shared_Pref_Name,MODE_PRIVATE);
        String kidname= sharedPreferences.getString(KEY_NAME,null);


        if (kidname!= null ){
            name_kid.setText(kidname);
        }

        btn__logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Intent intent=new Intent(MainActivity.this, SignIn.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Good bye",Toast.LENGTH_LONG).show();
                finish();

            }
        });


        clickAnimal();
        clickColor();
        clickShapes();
        clickNumbers();


    }

    private void clickAnimal() {
        animalsList = findViewById(R.id.animals);
        animalsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, animal_Level.class);
                startActivity(i);
            }
        });
    }




    private void clickColor() {
        colorsList = findViewById(R.id.colors);
        colorsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, color_levels.class);
                startActivity(i);
            }
        });
    }

    private void clickShapes() {
        shapesList = findViewById(R.id.shapes);
        shapesList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, shapes_levels.class);
                startActivity(i);
            }
        });
    }

    private void clickNumbers() {
        numbersList = findViewById(R.id.numbers);
        numbersList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, numbers_levels.class);
                startActivity(i);
            }
        });
    }


}
