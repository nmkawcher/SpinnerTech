package com.kawcher.spinnertech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private int i = 0;
    private ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                ,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);


        imageview=findViewById(R.id.image_view);



        new CountDownTimer(4000, 1000) {

            public void onTick(long millisUntilFinished) {
                i++;

                if(i == 1){
                    imageview.setImageResource(R.drawable.mad);
                }
                else if(i == 2){
                    imageview.setImageResource(R.drawable.service);
                }
                else if(i == 3){
                    imageview.setImageResource(R.drawable.web_desktop);
                }
                else if(i==4){
                    imageview.setImageResource(R.drawable.web_service);
                }
            }

            public void onFinish() {
                //finish your splash screen activity
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }

        }.start();
    }
}