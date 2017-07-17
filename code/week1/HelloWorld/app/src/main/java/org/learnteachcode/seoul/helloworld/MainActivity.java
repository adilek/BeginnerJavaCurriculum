package org.learnteachcode.seoul.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView textView = (TextView) findViewById(R.id.message);
        String name = "Yourname";
        textView.setText("Hello " + name);
    }
}
