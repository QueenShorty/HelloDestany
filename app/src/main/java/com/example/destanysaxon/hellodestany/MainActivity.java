package com.example.destanysaxon.hellodestany;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Destany","Button clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.red));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Destany","Button clicked");
                 findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.yellow));
            }
         });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("Destany","Button clicked");
                    //grad the text the user inputted
                    String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                    if(TextUtils.isEmpty((newText))){
                        ((TextView) findViewById(R.id.textView)).setText("Hello from Destany!");
                    }
                    else {
                        ((TextView) findViewById(R.id.textView)).setText(newText);
                    }

                }
            });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //reset the text color back to pink
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.rosePink));

                ///reset the background color light blue
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.lightBlue));

                //reset the text back to "hello from Destany!"
                ((TextView) findViewById(R.id.textView)).setText("Hello from Destany!");
            }
        });
    }
}
