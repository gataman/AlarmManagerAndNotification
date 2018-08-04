package com.gurcanataman.alarmmanagerandnotification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Start Alarm Manager for service:

        //First:
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,8);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        // Set Intent
        Intent intent1 = new Intent(context, ReminderService.class);
        intent1.putExtra("saat",1);
        PendingIntent pendingIntent = PendingIntent.getService(context, 100, intent1, PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);



        //Second:
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.HOUR_OF_DAY,12);
        calendar2.set(Calendar.MINUTE,0);
        calendar2.set(Calendar.SECOND,0);
        calendar2.set(Calendar.MILLISECOND,0);
        // Set Intent
        Intent intent2 = new Intent(context, ReminderService.class);
        intent2.putExtra("saat",2);
        PendingIntent pendingIntent2 = PendingIntent.getService(context, 101, intent2, PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarmManager2.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar2.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent2);



        //Third:
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(Calendar.HOUR_OF_DAY,20);
        calendar3.set(Calendar.MINUTE,0);
        calendar3.set(Calendar.SECOND,0);
        calendar3.set(Calendar.MILLISECOND,0);
        // Set Intent
        Intent intent3 = new Intent(context, ReminderService.class);
        intent3.putExtra("saat",3);
        PendingIntent pendingIntent3 = PendingIntent.getService(context, 102, intent3, PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager alarmManager3 = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarmManager3.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar3.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent3);


    }
}
