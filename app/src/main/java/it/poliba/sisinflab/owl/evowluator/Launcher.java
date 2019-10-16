package it.poliba.sisinflab.owl.evowluator;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Launcher extends Instrumentation {
    private boolean firstRun = true;
    private static final String PACKAGE = "target";
    private static final String ARGUMENTS = "args";
    private static final String LOG_TAG = "sisinflab_evowluator";

    @Override
    public void onCreate(Bundle arguments) {
        super.onCreate(arguments);
        if (firstRun) {
            firstRun = false;
            try {
                Intent intent;
                intent = new Intent(arguments.getString(PACKAGE) + ".EVOWLUATE");
                Log.i(LOG_TAG, arguments.getString(PACKAGE) + ".EVOWLUATE");
                intent.putExtra(Intent.EXTRA_TEXT, arguments.getString(ARGUMENTS));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                this.getContext().startActivity(intent);
            } catch (Exception e) {
                if (e.getMessage() != null){
                    Log.e(LOG_TAG, e.getMessage());
                }
                this.finish(1, null);
            }
        } else {
            Log.e(LOG_TAG, "[ERROR]: instrumentation already run");
        }
    }
}
