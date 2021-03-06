package uk.co.johnmelodyme.fiftyshadesofgrey.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import uk.co.johnmelodyme.fiftyshadesofgrey.R;

public class SplashActivity extends AppCompatActivity
{
    private static final String TAG = "50ShadesOfGrey";
    private static final int DELAY = 0x7d0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        SplashActivity.this.getWindow().setContentView(R.layout.activity_splash);

        /* Set Color to status bar */
        SplashActivity.this.getWindow().setStatusBarColor(ContextCompat.getColor(SplashActivity.this, R.color.black));

        /* Set Color to bottom navigation bar */
        SplashActivity.this.getWindow().setNavigationBarColor(ContextCompat.getColor(SplashActivity.this, R.color.black));

        /* Run splash screen delayed to 2000 milliseconds */
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent i = new Intent(SplashActivity.this, ApplicationActivity.class);
                SplashActivity.this.startActivity(i);

                Log.d(TAG, "... Splash called.");

                SplashActivity.this.finish();
            }
        }, DELAY);
    }
}