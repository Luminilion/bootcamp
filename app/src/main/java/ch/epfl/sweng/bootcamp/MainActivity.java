package ch.epfl.sweng.bootcamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_MESSAGE = "ch.epfl.sweng.bootcamp.EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.mainGoButton);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.mainGoButton) {
            EditText e = findViewById(R.id.mainText);
            Intent i = new Intent(this, GreetingsActivity.class);
            i.putExtra(EXTRA_MESSAGE, e.getText().toString());
            startActivity(i);
        }
    }
}
