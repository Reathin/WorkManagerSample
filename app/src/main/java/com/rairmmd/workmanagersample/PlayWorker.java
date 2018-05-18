package com.rairmmd.workmanagersample;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

/**
 * @author Rair
 * @date 2018/5/18
 * <p>
 * desc:
 */
public class PlayWorker extends Worker {

    @NonNull
    @Override
    public WorkerResult doWork() {
        Log.i("Rair", "(PlayWorker.java:19)-doWork:->");
        return WorkerResult.SUCCESS;
    }
}
