package com.giang.appthoitiet3;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class NotificationApp extends Application {
    public static final String CHANNEL_1_ID = "channel1";
    public static final String CHANNEL_2_ID = "channel2";
    public static final String CHANNEL_3_ID = "channel3";

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate ();

        this.createNotificationChannels ();
    }

    private void createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel1 = new NotificationChannel (
                    CHANNEL_1_ID,
                    "Channel 1",
                    NotificationManager.IMPORTANCE_HIGH
            );
            channel1.setDescription ( "This is channel 1" );

            NotificationChannel channel2 = new NotificationChannel (
                    CHANNEL_2_ID,
                    "Channel 2",
                    NotificationManager.IMPORTANCE_LOW
            );
            channel1.setDescription ( "This is channel 2" );

            NotificationChannel channel3 = new NotificationChannel (
                    CHANNEL_3_ID,
                    "Channel 3",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            channel3.setDescription ( "This is channel 3" );


            NotificationManager manager = this.getSystemService ( NotificationManager.class );
            manager.createNotificationChannel ( channel1 );
            manager.createNotificationChannel ( channel2 );
            manager.createNotificationChannel ( channel3 );
        }
    }
}
