package com.gurcanataman.alarmmanagerandnotification;

import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.util.Log;

import br.com.goncalves.pugnotification.notification.PugNotification;


public class ReminderService extends IntentService {

    public ReminderService() {
        super("ReminderService");

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.e("SERVICE","starting...");

        int saat = intent.getIntExtra("saat",0);
        Log.e("Gelen Saat",""+saat);
        String message;

        switch (saat){
            case 1:
                message = "Saat 8'deki mesaj";
                break;

            case 2:
                message = "Saat 12'deki mesaj";
                break;

            case 3:
                message = "Saat 20'deki mesaj";
                break;

            default:
                message = "Belirsiz saatteki mesaj";

        }

            postNotification(message);


    }

    private void postNotification(String message) {


        PugNotification.with(this)
                .load()
                .title("Hatırlarma:")
                .message(message)
                .bigTextStyle(message)
                .smallIcon(R.drawable.ic_notifications)
                .largeIcon(R.drawable.ic_notifications)
                .flags(Notification.DEFAULT_ALL)
                .click(MainActivity.class)
                .autoCancel(true)
                .simple()
                .build();
    }

}
