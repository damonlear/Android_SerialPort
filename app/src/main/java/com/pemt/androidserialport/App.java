package com.pemt.androidserialport;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import net.danlew.android.joda.JodaTimeAndroid;

/**
 * author： pemt
 * date:    2018/5/26
 * desc:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Utils.init(this);

        JodaTimeAndroid.init(this);
    }
}
