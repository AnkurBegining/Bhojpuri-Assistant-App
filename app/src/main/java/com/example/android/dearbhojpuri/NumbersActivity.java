package com.example.android.dearbhojpuri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.dearbhojpuri.R.id.activity_main;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Words> wordList=new ArrayList<Words>();
        wordList.add(new Words("one","ek"));
        wordList.add(new Words("two","do"));
        wordList.add(new Words("three","tin"));
        wordList.add(new Words("four","char"));
        wordList.add(new Words("five","panch"));
        wordList.add(new Words("six","cheh"));
        wordList.add(new Words("seven","saat"));
        wordList.add(new Words("eight","aaath"));
        wordList.add(new Words("nine","nav"));
        wordList.add(new Words("ten","dus"));

        WordAdapter adapter=new WordAdapter(this,wordList);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
