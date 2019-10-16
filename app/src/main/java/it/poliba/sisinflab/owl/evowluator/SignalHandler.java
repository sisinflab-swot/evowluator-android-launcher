package it.poliba.sisinflab.owl.evowluator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Process;

public class SignalHandler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String action = getIntent().getAction();
        if(action != null && action.endsWith(".END")) {
            Process.killProcess(Process.myPid());
            finish();
        }
    }
}
