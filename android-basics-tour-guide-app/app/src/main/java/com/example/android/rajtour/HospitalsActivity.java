package com.example.android.rajtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.rajtour.R;

import java.util.ArrayList;

public class HospitalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord("Sunrise Hospital", "Kalindi colony", R.drawable.hospital));
        dataWord.add(new DataWord("All India Institute of Medical Sciences", "Ansari Nagar", R.drawable.hospital));
        dataWord.add(new DataWord("Dharamshila Cancer Hospital and Research Centre",
                "Dharamshila Marg, Vasundhara Enclave", R.drawable.hospital));
        dataWord.add(new DataWord("Guru Teg Bahadur Hospital", "Dilshad Garden", R.drawable.hospital));
        dataWord.add(new DataWord("Maharaja Agrasen Hospital", "West Punjabi Bagh", R.drawable.hospital));
        dataWord.add(new DataWord("St. Stephen's Hospital", "Delhi, Tis Hazari", R.drawable.hospital));
        dataWord.add(new DataWord("Eden Hospital", "East of Kailash, New Delhi, 110065", R.drawable.hospital));
        dataWord.add(new DataWord("Ram Manohar Lohia Hospital", "Baba Kharag Singh Marg", R.drawable.hospital));
        dataWord.add(new DataWord("Sir Ganga Ram Hospital", "Rajendar Nagar", R.drawable.hospital));
        dataWord.add(new DataWord("Holy Family Hospital", "Jamia Nagar, Friends Colony", R.drawable.hospital));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_hospitals);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
