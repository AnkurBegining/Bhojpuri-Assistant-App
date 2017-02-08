package com.example.android.dearbhojpuri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number=(TextView)findViewById(R.id.numberId);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Numbers",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(intent);

            }
        });

    }
}
