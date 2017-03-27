package ch.ffhs.fs17.esa.handson_musicplayer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    private Intent mIntentToPlayMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIntentToPlayMusic = new Intent(this, MusicPlayerSvc.class);
        setContentView(R.layout.activity_start);
    }

    public void OnStartClicked(View view) {
        startService(mIntentToPlayMusic);
    }

    public void OnStopClicked(View view) {
        stopService(mIntentToPlayMusic);
    }
}
