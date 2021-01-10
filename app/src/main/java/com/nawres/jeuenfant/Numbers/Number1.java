package com.nawres.jeuenfant.Numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.nawres.jeuenfant.R;

public class Number1 extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number1);
        background();
    }



    private void background(){
        LinearLayout ll = findViewById(R.id.layout);
        AnimationDrawable animated = (AnimationDrawable) ll.getBackground();

        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(4000);
        animated.start();
    }

    public void play(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.number_one);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause(View view) {
        if (player != null) {
            player.pause();
        }
    }

    public void stop(View view) {
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
            Toast.makeText(this, "Stoped", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }


    public void next(View view) {
        startActivity(new Intent(getApplicationContext(), Number2.class));
        finish();
    }


}


