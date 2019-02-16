package com.example.zack.mp3play;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.AssetFileDescriptor;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;
    MediaPlayer mPlayer2;
    MediaPlayer mPlayer3;
    MediaPlayer mPlayer4;
    MediaPlayer mPlayer5;
    MediaPlayer mPlayer6;

    int playstate = 0;
    public void  init (){

        MediaPlayer[] players = new MediaPlayer[2];
        int [] songs = {R.raw.lambsoprano ,R.raw.lamalto,R.raw.lambtenor,R.raw.lambbass};

        for(int i=0;i<2;i++){
            players[i]= MediaPlayer.create(this, songs[i]);

        }
       // players



        PlayThread[] playThreads = new PlayThread[2];
        for (int i = 0; i < 2; i++)
            playThreads[i] = new PlayThread();
//Set Media Players there and start playing
        for (int i = 0; i <  2; i++)
            playThreads[i].executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, players[i]);

    }
    public void  multiplay (boolean [] toplay){

        MediaPlayer[] players = new MediaPlayer[2];
        int [] songs = {R.raw.lambsoprano ,R.raw.lamalto,R.raw.lambtenor,R.raw.lambbass};



        for(int i=0;i<4;i++){
            if(toplay[i]==true){
                for(int j=0;j<2;j++){
                    players[j]= MediaPlayer.create(this, songs[i]);


                }
            }


        }

        float log1=(float)(Math.log(100-40)/Math.log(40));
        float log2=(float)(Math.log(100-60)/Math.log(60));
            players[0].setVolume(log1,log1);
            players[1].setVolume(log2,log2);

        PlayThread[] playThreads = new PlayThread[2];
        for (int i = 0; i < 2; i++)
            playThreads[i] = new PlayThread();
//Set Media Players there and start playing
        for (int i = 0; i <  2; i++)
            playThreads[i].executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, players[i]);

    }

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
        final Button selectparts = findViewById(R.id.selectparts);


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
                    mPlayer5.seekTo(0);
                    mPlayer5.start();
                    playstate = 1;

                } else {
                    mPlayer5.stop();
                    playstate = 0;
                    try {
                        mPlayer5.prepare();

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
                    mPlayer3.seekTo(0);
                    mPlayer3.start();
                    playstate = 1;

                } else {
                    mPlayer3.stop();
                    playstate = 0;
                    try {
                        mPlayer3.prepare();

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
                    mPlayer4.seekTo(0);
                    mPlayer4.start();
                    playstate = 1;

                } else {
                    mPlayer4.stop();
                    playstate = 0;
                    try {
                        mPlayer4.prepare();

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
                    mPlayer6.seekTo(0);
                    mPlayer6.start();
                    playstate = 1;

                } else {
                    mPlayer6.stop();
                    playstate = 0;
                    try {
                        mPlayer6.prepare();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


            }
        });




        selectparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Build an AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                // String array for alert dialog multi choice items
                String[] colors = new String[]{
                        "Soprano",
                        "Alto",
                        "Tenor",
                        "Bass",

                };

                // Boolean array for initial selected items
                final boolean[] checkedColors = new boolean[]{
                        false, // Red
                        false, // Green
                        false, // Blue
                        false, // Purple


                };



                // Convert the color array to list
                final List<String> colorsList = Arrays.asList(colors);

                // Set multiple choice items for alert dialog
                /*
                    AlertDialog.Builder setMultiChoiceItems(CharSequence[] items, boolean[]
                    checkedItems, DialogInterface.OnMultiChoiceClickListener listener)
                        Set a list of items to be displayed in the dialog as the content,
                        you will be notified of the selected item via the supplied listener.
                 */
                /*
                    DialogInterface.OnMultiChoiceClickListener
                    public abstract void onClick (DialogInterface dialog, int which, boolean isChecked)

                        This method will be invoked when an item in the dialog is clicked.

                        Parameters
                        dialog The dialog where the selection was made.
                        which The position of the item in the list that was clicked.
                        isChecked True if the click checked the item, else false.
                 */
                builder.setMultiChoiceItems(colors, checkedColors, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                        // Update the current focused item's checked status
                        checkedColors[which] = isChecked;


                        // Get the current focused item
                        String currentItem = colorsList.get(which);

                        // Notify the current action
                        Toast.makeText(getApplicationContext(),
                                currentItem + " " + isChecked, Toast.LENGTH_SHORT).show();
                    }
                });

                // Specify the dialog is not cancelable
                builder.setCancelable(false);

                // Set a title for alert dialog
                builder.setTitle("Your preferred colors?");

                // Set the positive/yes button click listener
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something when click positive button
                       /* for (int i = 0; i<checkedColors.length; i++){
                            boolean checked = checkedColors[i];
                            if (checked) {
                                System.out.println(colorsList.get(i) + "\n");

                            }
                        }*/

                      multiplay(checkedColors);
                    }
                });

                // Set the negative/no button click listener
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something when click the negative button
                    }
                });

                // Set the neutral/cancel button click listener
                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something when click the neutral button
                    }
                });

                AlertDialog dialog = builder.create();
                // Display the alert dialog on interface
                dialog.show();
            }
        });




    }

//main activity

}

