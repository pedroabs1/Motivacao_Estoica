package com.motivacaoestoica;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

//@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//public class job extends JobService {
//    private class static final String TAG = "job";
//    private boolean jobCancelled = false;
//    @Override
//    public boolean onStartJob(JobParameters jobParameters) {
//        Log.d(TAG, "Job started")
//        return true;
//    }
//    private void doBackgroundWork(JobParameters Params){
//        new Thread(new Runnable(){
//            @Override
//            public void run(){
//                for (int i  = 0; i <10; i++){
//                    Log.d(TAG, "run: " + i );
//                    if (jobCancelled)
//                    {
//                        return;
//                    }
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                Log.d(TAG, "Job finished")
//                jobFinished(Params,true);
//            }
//        }).start();
//    }
//
//    @Override
//    public boolean onStopJob(JobParameters jobParameters) {
//        Log.d(TAG,"Job cancelled before completed")
//        jobCancelled = true;
//        return false;
//    }
//}
