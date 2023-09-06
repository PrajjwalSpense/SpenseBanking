package com.spensesdk.spensebank.helper.taskrunner;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TaskRunner {
    private final Executor executor = Executors.newSingleThreadExecutor(); // change according to your requirements
    private final Handler handler = new Handler(Looper.getMainLooper());

    private Task task;

    public TaskRunner() {
        this.task = null;
    }

    public void setTask(Task task) {
        executor.execute(() -> {
            task.execute();
            handler.post(() -> {
                task.done();
            });
        });
    }
}
