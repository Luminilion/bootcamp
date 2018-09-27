package ch.epfl.sweng.bootcamp;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

public class GreetingsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);

        String newContent = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView t = findViewById(R.id.greetingMessage);
        t.setText(newContent);

        //Log.i("Intent Message", newContent);
    }

}
