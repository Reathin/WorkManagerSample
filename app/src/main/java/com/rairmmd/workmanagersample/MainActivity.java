package com.rairmmd.workmanagersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkManager mWorkManager = WorkManager.getInstance();
        mWorkManager.enqueue(OneTimeWorkRequest.from(PlayWorker.class));
    }
}
