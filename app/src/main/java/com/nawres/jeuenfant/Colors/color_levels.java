package com.nawres.jeuenfant.Colors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.nawres.jeuenfant.Animals.Animal_Level1;
import com.nawres.jeuenfant.Animals.Animal_Level2;
import com.nawres.jeuenfant.Animals.Animal_Level3;
import com.nawres.jeuenfant.Animals.Animal_Level4;
import com.nawres.jeuenfant.Animals.Animal_Level5;
import com.nawres.jeuenfant.Animals.Animal_Level6;
import com.nawres.jeuenfant.Animals.Animal_Level7;
import com.nawres.jeuenfant.Animals.Animal_Level8;
import com.nawres.jeuenfant.Animals.Animal_Level9;
import com.nawres.jeuenfant.Colors.Color_Level1;
import com.nawres.jeuenfant.Colors.Color_Level2;
import com.nawres.jeuenfant.Colors.Color_Level3;
import com.nawres.jeuenfant.Colors.Color_Level4;
import com.nawres.jeuenfant.Colors.Color_Level5;
import com.nawres.jeuenfant.Colors.Color_Level6;
import com.nawres.jeuenfant.Colors.Color_Level7;
import com.nawres.jeuenfant.Colors.Color_Level8;
import com.nawres.jeuenfant.Colors.Color_Level9;
import com.nawres.jeuenfant.MainActivity;
import com.nawres.jeuenfant.R;

public class color_levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_color_levels);
        backgroundDesign();

    }




    private void backgroundDesign(){
        LinearLayout color=findViewById(R.id.Colorlayout1);
        AnimationDrawable animated = (AnimationDrawable) color.getBackground();
        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(4000);
        animated.start();
    }

    public void home(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }

    public void color_level1(View view) {
        startActivity(new Intent(getApplicationContext(), Color_Level1.class));

    }
    public void color_level2(View view) {
        startActivity(new Intent(getApplicationContext(), Color_Level2.class));

    }
    public void color_level3(View view) {
        startActivity(new Intent(getApplicationContext(), Color_Level3.class));

    }
    public void color_level4(View view) {
        startActivity(new Intent(getApplicationContext(), Color_Level4.class));

    } public void color_level5(View view) {
        startActivity(new Intent(getApplicationContext(), Color_Level5.class));

    }
    public void color_level6(View view) {
        startActivity(new Intent(getApplicationContext(), Color_Level6.class));

    }
    public void color_level7(View view) {
        startActivity(new Intent(getApplicationContext(), Color_Level7.class));

    } public void color_level8(View view) {
        startActivity(new Intent(getApplicationContext(), Color_Level8.class));

    } public void color_level9(View view) {
        startActivity(new Intent(getApplicationContext(), Color_Level9.class));

    }




}
