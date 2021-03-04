package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        final ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("әpә","Father",R.drawable.family_father,R.raw.family_father));
        words.add(new Word("әṭa","Mother",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("angsi","Son",R.drawable.family_son,R.raw.family_son));
        words.add(new Word("tune","Daughter",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("taachi","Older brother",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Word("chalitti","Younger brother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("teṭe","Older sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("kolliti","Younger sister",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("ama","Grandmother",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("paapa","Grandfather",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter Adapter = new WordAdapter (this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
        listView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = words.get (position);
                mMediaPlayer = MediaPlayer.create (FamilyActivity.this,word.getmAudioResourseId ());
                mMediaPlayer.start ();
            }

        });
    }
}
