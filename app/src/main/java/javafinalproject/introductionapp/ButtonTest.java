package javafinalproject.introductionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ButtonTest extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_test);
    }

    //Changes the text in the textbox
    public void textButtonClick(View view)
    {
        TextView text = (TextView)findViewById(R.id.textView);
        text.setText("Test Complete");
    }

    //Takes user to a new screen
    public void activityButtonClick(View view)
    {
        Intent in = new Intent("javafinalproject.introductionapp.SecondActivity");
        startActivity(in);
    }


}
