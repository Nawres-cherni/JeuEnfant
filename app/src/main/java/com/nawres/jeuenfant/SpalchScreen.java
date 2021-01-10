package com.nawres.jeuenfant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SpalchScreen extends AppCompatActivity {
    private  static  int SPLASH_SCREEN=2000;
    private static  final String Shared_Pref_Name="mypref";
    public static  final String KEY_NAME="name";
    public static  final String PREF_IS_CONNECT="is connected";

    Animation topAnim, bottomAnim;
    ImageView image;
    TextView premText,deText,troiText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_spalch_screen);


        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image=findViewById(R.id.imageView);
        premText=findViewById(R.id.textView1);
        deText=findViewById(R.id.textView2);
        troiText=findViewById(R.id.textView3);


        image.setAnimation(topAnim);
        premText.setAnimation(bottomAnim);
        deText.setAnimation(bottomAnim);
        troiText.setAnimation(bottomAnim);
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                openNextScreen();
                finish();
            }
        },SPLASH_SCREEN );

    }


    private void openNextScreen(){
        SharedPreferences sharedPreferences = getSharedPreferences(Shared_Pref_Name,MODE_PRIVATE);
        boolean is_connected= sharedPreferences.getBoolean(PREF_IS_CONNECT,false);
        if(is_connected){
            startActivity(new Intent(SpalchScreen.this, MainActivity.class));
        }
        else{
            startActivity(new Intent(SpalchScreen.this, SignIn.class));
        }

    }



}
