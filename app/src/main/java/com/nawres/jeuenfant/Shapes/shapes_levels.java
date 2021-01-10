package com.nawres.jeuenfant.Shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

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
import com.nawres.jeuenfant.Shapes.Shape_Level1;
import com.nawres.jeuenfant.Shapes.Shape_Level2;
import com.nawres.jeuenfant.Shapes.Shape_Level3;
import com.nawres.jeuenfant.Shapes.Shape_Level4;
import com.nawres.jeuenfant.Shapes.Shape_Level5;
import com.nawres.jeuenfant.Shapes.Shape_Level6;
import com.nawres.jeuenfant.Shapes.Shape_Level7;
import com.nawres.jeuenfant.Shapes.Shape_Level8;
import com.nawres.jeuenfant.Shapes.Shape_Level9;

public class shapes_levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes_levels);
        backgroundDesign();

    }




    private void backgroundDesign(){
        LinearLayout color=findViewById(R.id.ShapeLevel1);
        AnimationDrawable animated = (AnimationDrawable) color.getBackground();
        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(2000);
        animated.start();
    }


    public void home(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }

    public void shapes_level1(View view) {
        startActivity(new Intent(getApplicationContext(), Shape_Level1.class));

    }
    public void shapes_level2(View view) {
        startActivity(new Intent(getApplicationContext(), Shape_Level2.class));

    }
    public void shapes_level3(View view) {
        startActivity(new Intent(getApplicationContext(), Shape_Level3.class));

    }
    public void shapes_level4(View view) {
        startActivity(new Intent(getApplicationContext(), Shape_Level4.class));

    } public void shapes_level5(View view) {
        startActivity(new Intent(getApplicationContext(), Shape_Level5.class));

    }
    public void shapes_level6(View view) {
        startActivity(new Intent(getApplicationContext(), Shape_Level6.class));

    }
    public void shapes_level7(View view) {
        startActivity(new Intent(getApplicationContext(), Shape_Level7.class));

    } public void shapes_level8(View view) {
        startActivity(new Intent(getApplicationContext(), Shape_Level8.class));

    } public void shapes_level9(View view) {
        startActivity(new Intent(getApplicationContext(), Shape_Level9.class));

    }




}
