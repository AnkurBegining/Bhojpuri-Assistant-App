package com.example.android.dearbhojpuri;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 08-02-2017.
 */

public class WordAdapter extends ArrayAdapter<Words> {
    public WordAdapter(Activity context, ArrayList<Words> Words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView=convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Words currentWord=getItem(position);
        TextView bhojpuriTextView = (TextView) listItemView.findViewById(R.id.bhojpuri_text_view);
        bhojpuriTextView.setText(currentWord.getBhojpuriTranslation());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.eng_text_view);
        englishTextView.setText(currentWord.getEnglishTranslation());

        return listItemView;







    }
}
