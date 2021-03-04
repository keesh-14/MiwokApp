package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        final ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("weṭeṭṭi","Red",R.drawable.color_red,R.raw.color_red));
        words.add(new Word("chokokki","Green",R.drawable.color_green,R.raw.color_green));
        words.add(new Word("ṭakaakki","Brown",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word("ṭopoppi","Grey",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Word("kululli","Black",R.drawable.color_black,R.raw.color_black));
        words.add(new Word("kelelli","White",R.drawable.color_white,R.raw.color_white));
        words.add(new Word("ṭopiisә","Dusty Yellow", R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word("chiwiiṭә","Mustard Yellow", R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        WordAdapter Adapter = new WordAdapter (this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
        listView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = words.get (position);
                mMediaPlayer = MediaPlayer.create (ColorsActivity.this,word.getmAudioResourseId ());
                mMediaPlayer.start ();
            }

        });
    }
}
