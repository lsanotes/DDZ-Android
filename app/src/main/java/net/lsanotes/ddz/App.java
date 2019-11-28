package net.lsanotes.ddz;

import android.app.Application;

import com.pgyersdk.crash.PgyCrashManager;
import com.pgyersdk.feedback.PgyerFeedbackManager;
import com.pgyersdk.update.PgyUpdateManager;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PgyCrashManager.register();
        new PgyerFeedbackManager.PgyerFeedbackBuilder().builder().register();
        new PgyUpdateManager.Builder().register();
    }
}
