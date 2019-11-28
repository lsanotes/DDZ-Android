package net.lsanotes.ddz;

import android.app.Application;

import com.pgyersdk.crash.PgyCrashManager;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PgyCrashManager.register();
    }
}
