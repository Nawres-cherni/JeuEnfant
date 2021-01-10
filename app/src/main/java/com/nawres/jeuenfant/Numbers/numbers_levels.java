package com.nawres.jeuenfant.Numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.nawres.jeuenfant.MainActivity;
import com.nawres.jeuenfant.Numbers.Number1;
import com.nawres.jeuenfant.Numbers.Number2;
import com.nawres.jeuenfant.Numbers.Number3;
import com.nawres.jeuenfant.Numbers.Number4;
import com.nawres.jeuenfant.Numbers.Number5;
import com.nawres.jeuenfant.Numbers.Number6;
import com.nawres.jeuenfant.Numbers.Number7;
import com.nawres.jeuenfant.Numbers.Number8;
import com.nawres.jeuenfant.Numbers.Number9;
import com.nawres.jeuenfant.R;

public class numbers_levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_levels);
        backgroundDesign();

    }




    private void backgroundDesign(){
        LinearLayout color=findViewById(R.id.Numberlayout1);
        AnimationDrawable animated = (AnimationDrawable) color.getBackground();
        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(2000);
        animated.start();
    }

    public void home(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }

    public void number_1(View view) {
        startActivity(new Intent(getApplicationContext(), Number1.class));
    }

    public void number_2(View view) {
        startActivity(new Intent(getApplicationContext(), Number2.class));

    }

    public void number_3(View view) {
        startActivity(new Intent(getApplicationContext(), Number3.class));

    }

    public void number_4(View view) {
        startActivity(new Intent(getApplicationContext(), Number4.class));

    }

    public void number_5(View view) {
        startActivity(new Intent(getApplicationContext(), Number5.class));

    }


    public void number_6(View view) {
        startActivity(new Intent(getApplicationContext(), Number6.class));

    }

    public void number_7(View view) {
        startActivity(new Intent(getApplicationContext(), Number7.class));

    }

    public void number_8(View view) {
        startActivity(new Intent(getApplicationContext(), Number8.class));

    }

    public void number_9(View view) {
        startActivity(new Intent(getApplicationContext(), Number9.class));

    }
}


