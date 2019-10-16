package it.poliba.sisinflab.owl.evowluator;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Launcher extends Instrumentation {
    private static final String PACKAGE = "target";
    private static final String ARGUMENTS = "args";
    private static final String LOG_TAG = "sisinflab_evowluator";

    private boolean firstRun = true;

    @Override
    public void onCreate(Bundle arguments) {
        super.onCreate(arguments);

        if (!firstRun) {
            Log.e(LOG_TAG, "[ERROR]: instrumentation already run");
            return;
        }

        firstRun = false;

        try {
            String action = arguments.getString(PACKAGE) + ".EVOWLUATE";
            Log.i(LOG_TAG, action);

            Intent intent = new Intent(action);
            intent.putExtra(Intent.EXTRA_TEXT, arguments.getString(ARGUMENTS));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            this.getContext().startActivity(intent);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                Log.e(LOG_TAG, e.getMessage());
            }
            this.finish(1, null);
        }
    }
}
