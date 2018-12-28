package com.example.zack.mp3play;

import android.content.res.AssetFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;
    MediaPlayer mPlayer2;
    MediaPlayer mPlayer3;
    MediaPlayer mPlayer4;
    MediaPlayer mPlayer5;
    MediaPlayer mPlayer6;

    int playstate = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button balanced = findViewById(R.id.balanced);
        final Button piano = findViewById(R.id.piano);
        final Button alto = findViewById(R.id.alto);
        final Button soprano = findViewById(R.id.soprano);
        final Button tenor = findViewById(R.id.tenor);
        final Button bass = findViewById(R.id.bass);

        mPlayer = MediaPlayer.create(this, R.raw.lambalanced);
        mPlayer2 = MediaPlayer.create(this, R.raw.lambpiano);
        mPlayer3 = MediaPlayer.create(this, R.raw.lambsoprano);
        mPlayer4 = MediaPlayer.create(this, R.raw.lamalto);
        mPlayer5 = MediaPlayer.create(this, R.raw.lambtenor);
        mPlayer6 = MediaPlayer.create(this, R.raw.lambbass);
        balanced .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello");
                // Code here executes on main thread after user presses button
                if (playstate == 0) {
                    mPlayer.seekTo(0);
                    mPlayer.start();
                    playstate = 1;

                } else {
                    mPlayer.stop();
                    playstate = 0;
                    try {
                        mPlayer.prepare();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


            }
        });
        piano.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello");
                // Code here executes on main thread after user presses button
                if (playstate == 0) {
                    mPlayer2.seekTo(0);
                    mPlayer2.start();
                    playstate = 1;

                } else {
                    mPlayer2.stop();
                    playstate = 0;
                    try {
                        mPlayer2.prepare();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


            }
        });
        tenor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello");
                // Code here executes on main thread after user presses button
                if (playstate == 0) {
                    mPlayer2.seekTo(0);
                    mPlayer2.start();
                    playstate = 1;

                } else {
                    mPlayer2.stop();
                    playstate = 0;
                    try {
                        mPlayer2.prepare();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


            }
        });
        soprano.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello");
                // Code here executes on main thread after user presses button
                if (playstate == 0) {
                    mPlayer2.seekTo(0);
                    mPlayer2.start();
                    playstate = 1;

                } else {
                    mPlayer2.stop();
                    playstate = 0;
                    try {
                        mPlayer2.prepare();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


            }
        });
        alto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello");
                // Code here executes on main thread after user presses button
                if (playstate == 0) {
                    mPlayer2.seekTo(0);
                    mPlayer2.start();
                    playstate = 1;

                } else {
                    mPlayer2.stop();
                    playstate = 0;
                    try {
                        mPlayer2.prepare();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


            }
        });
        alto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello");
                // Code here executes on main thread after user presses button
                if (playstate == 0) {
                    mPlayer2.seekTo(0);
                    mPlayer2.start();
                    playstate = 1;

                } else {
                    mPlayer2.stop();
                    playstate = 0;
                    try {
                        mPlayer2.prepare();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


            }
        });
        tenor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello");
                // Code here executes on main thread after user presses button
                if (playstate == 0) {
                    mPlayer2.seekTo(0);
                    mPlayer2.start();
                    playstate = 1;

                } else {
                    mPlayer2.stop();
                    playstate = 0;
                    try {
                        mPlayer2.prepare();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


            }
        });

        bass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello");
                // Code here executes on main thread after user presses button
                if (playstate == 0) {
                    mPlayer2.seekTo(0);
                    mPlayer2.start();
                    playstate = 1;

                } else {
                    mPlayer2.stop();
                    playstate = 0;
                    try {
                        mPlayer2.prepare();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


            }
        });




    }

//main activity

}

