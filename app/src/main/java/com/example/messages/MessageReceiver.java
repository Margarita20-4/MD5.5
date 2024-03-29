package com.example.messages;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MessageReceiver extends BroadcastReceiver {
    public static final String MY_TAG = "BCST";

    @Override
    public void onReceive(Context context, Intent intent) {
        String finStr = "Сообщение: " + "\n\n" +
                intent.getStringExtra("com.example.broadcast.Message");
        Toast.makeText(context, finStr,
                Toast.LENGTH_LONG).show();
        Log.i(MY_TAG, finStr);
    }
}