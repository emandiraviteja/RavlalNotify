package com.ravlal.ravlalnotify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example
//        Notify.build(getApplicationContext())
//                .setTitle("Jill Zhao")
//                .setContent("Hi! So I meet you today?")
//                .setSmallIcon(R.drawable.ic_notifications_none_white_24dp)
//                .setLargeIcon("https://images.pexels.com/photos/139829/pexels-photo-139829.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=150&w=440")
//                .largeCircularIcon()
//                .setPicture("https://images.pexels.com/photos/1058683/pexels-photo-1058683.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
//                .setColor(R.color.colorPrimary)
//                .show();

        Notify.build(getApplicationContext())
                .setTitle("Hurray")
                .setContent("Notification Works")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setLargeIcon(R.mipmap.ic_launcher)
                .setColor(R.color.purple_500)
                .show();
    }
}