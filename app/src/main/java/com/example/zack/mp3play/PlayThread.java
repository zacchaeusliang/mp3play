package com.example.zack.mp3play;

import android.media.MediaPlayer;
import android.os.AsyncTask;

class PlayThread extends AsyncTask<MediaPlayer, Void, Void>
{
    @Override
    protected Void doInBackground(MediaPlayer... player) {

        player[0].start();
        return null;
    }


}