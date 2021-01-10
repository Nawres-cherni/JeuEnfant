package com.nawres.jeuenfant.Animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.nawres.jeuenfant.MainActivity;
import com.nawres.jeuenfant.R;

public class animal_Level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animal__level);

        backgroundDesign();

    }




    private void backgroundDesign(){
       LinearLayout ll=findViewById(R.id.layout1);
       AnimationDrawable animated = (AnimationDrawable) ll.getBackground();
       animated.setEnterFadeDuration(2000);
       animated.setExitFadeDuration(4000);
       animated.start();
   }

    public void home(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }

    public void level_1(View view) {
        startActivity(new Intent(getApplicationContext(), Animal_Level1.class));

    }
    public void level_2(View view) {
        startActivity(new Intent(getApplicationContext(), Animal_Level2.class));

    }
    public void level_3(View view) {
        startActivity(new Intent(getApplicationContext(), Animal_Level3.class));

    }
    public void level_4(View view) {
        startActivity(new Intent(getApplicationContext(), Animal_Level4.class));

    } public void level_5(View view) {
        startActivity(new Intent(getApplicationContext(), Animal_Level5.class));

    }
    public void level_6(View view) {
        startActivity(new Intent(getApplicationContext(), Animal_Level6.class));

    }
    public void level_7(View view) {
        startActivity(new Intent(getApplicationContext(), Animal_Level7.class));

    } public void level_8(View view) {
        startActivity(new Intent(getApplicationContext(), Animal_Level8.class));

    } public void level_9(View view) {
        startActivity(new Intent(getApplicationContext(), Animal_Level9.class));

    }




}
