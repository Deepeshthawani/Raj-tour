package com.example.android.rajtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.rajtour.R;

import java.util.ArrayList;

public class MetroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord("Civil Lines metro station", "Elevated Ajmer Road,Jai Ambey Colony,Civil lines,Jaipur", R.drawable.metro));
        dataWord.add(new DataWord("Ram Nagar metro station", "Hawa Sadak Road,Ramnagar Extension,Sodala,Jaipur", R.drawable.metro));
        dataWord.add(new DataWord("New Atish Market metro station", "Gopalpura Bypass Road,Devi Nagar,Jaipur", R.drawable.metro));
        dataWord.add(new DataWord("Chandpole metro station", "30,Station Road,Shri Ram Colony,Jaipur", R.drawable.metro));
        dataWord.add(new DataWord("Shyam Nagar metro station", "New Sanganer Road,Shyam Nagar,Jaipur", R.drawable.metro));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_metro);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
