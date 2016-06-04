package com.example.com.cameraapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static java.lang.System.currentTimeMillis;

public class NotificationActivity extends AppCompatActivity {

    EditText inputText;
    Button btnNotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        inputText=(EditText)findViewById(R.id.editText);

        btnNotify = (Button)findViewById(R.id.button2);
        btnNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNotification();
            }
        });

    }



    private void createNotification() {

        String text=inputText.getText().toString().trim();

         int mId =19 ;

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
                        mBuilder.setSmallIcon(R.drawable.ic_notifications_active_black_24dp);
                        mBuilder.setContentTitle("Notification");
                        mBuilder.setContentText(text);

        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        // mId allows you to update the notification later on.
        mNotificationManager.notify(mId, mBuilder.build());

    }



}


