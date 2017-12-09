package game.aliaksei.yesnogameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_start).setOnClickListener(this);
        findViewById(R.id.button_settings).setOnClickListener(this);
        findViewById(R.id.button_exit).setOnClickListener(this);
        findViewById(R.id.button_help).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button_start:
                // start game;
                break;
            case R.id.button_settings:
                // settings;
                break;
            case R.id.button_help:
                Intent intent = new Intent(this, HelpActivity.class);
                startActivity(intent);
                break;
            case R.id.button_exit:
                // exit program;
                break;
        }
    }
}
