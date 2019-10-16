package it.poliba.sisinflab.owl.evowluator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class SignalHandler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String action = intent.getAction();
        if(action != null && action.equals("it.poliba.sisinflab.owl.evowluator.END")) {
            android.os.Process.killProcess(android.os.Process.myPid());
            finish();
        }

    }
}
