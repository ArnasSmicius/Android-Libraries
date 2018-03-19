package com.example.arnassmicius.bolts;

import bolts.Task;
import bolts.TaskCompletionSource;

/**
 * Created by arnas on 18.2.16.
 */

public class SampleTask {

    public Task<String> suceededAsync() {
        TaskCompletionSource<String> successful = new TaskCompletionSource<>();
        successful.setResult("The good result.");
        return successful.getTask();
    }

    public Task<String> failAsync() {
        TaskCompletionSource<String> failed = new TaskCompletionSource<>();
        failed.setError(new RuntimeException("An error message."));
        return failed.getTask();
    }
}
