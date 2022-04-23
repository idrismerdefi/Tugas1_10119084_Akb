package com.example.tugas1_10119084;

/*
        Membuat Splash Activity

        Tanggal : Jumat, 22 04 2022

        Nama : Muhammad Idris Merdefi
        NIM : 1011905
        Kelas : IF2
*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        Thread thread = new Thread(){
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}

