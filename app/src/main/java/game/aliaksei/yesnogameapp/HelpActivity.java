package game.aliaksei.yesnogameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.text.Html;
import android.view.View;
import android.net.Uri;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button_my_email:
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse(getResources().getString(R.string.link_email))));
                break;
            case R.id.button_my_github:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.link_my_github))));
                break;
            case R.id.button_game_github:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.link_my_gamegithub))));
                break;
            case R.id.button_my_linkedin:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.link_my_linkedin))));
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        findViewById(R.id.button_my_linkedin).setOnClickListener(this);
        findViewById(R.id.button_game_github).setOnClickListener(this);
        findViewById(R.id.button_my_github).setOnClickListener(this);
        findViewById(R.id.button_my_email).setOnClickListener(this);

        TextView descriptionText = findViewById(R.id.descriptionText);
        descriptionText.setText(Html.fromHtml(getResources().getString(R.string.text_about_me)));
    }
}
