package com.example.android.miwok;

import android.media.MediaPlayer;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("lutti","One",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("otiiko","Two",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("tolookosu","Three",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("oyyisa","Four",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("massokka","Five",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("temmokka","Six",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("kenekaku","Seven",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("kawinta","Eight",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("wo’e","Nine",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("na’aacha","Ten",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter Adapter = new WordAdapter (this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
        listView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Word word = words.get (position);
            mMediaPlayer = MediaPlayer.create (NumbersActivity.this,word.getmAudioResourseId ());
            mMediaPlayer.start ();
            }

        });


    }
}
