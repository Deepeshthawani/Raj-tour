package com.example.android.rajtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.rajtour.R;

import java.util.ArrayList;

public class AtmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord("Canara Bank", "7/48, Bajaj Nagar, Tonk Road",R.drawable.atm_machine));
        dataWord.add(new DataWord("Canara Bank", "A3/12, Arihanth Plaza, Calgiri Marg",R.drawable.atm_machine));
        dataWord.add(new DataWord("ICICI Bank", "J L N Marg, Rajasthan college cumpus",R.drawable.atm_machine));
        dataWord.add(new DataWord("ICICI Bank", "H/2, Sardar Patel Road, C Scheme",R.drawable.atm_machine));
        dataWord.add(new DataWord("Bank of Baroda", "Kalwar Rd, Laxmi Nagar III",R.drawable.atm_machine));
        dataWord.add(new DataWord("Bank of Baroda", "60/186, Rajat Path, Ward 27",R.drawable.atm_machine));
        dataWord.add(new DataWord("Punjab National Bank", "Bapu Nagar, Jaipur",R.drawable.atm_machine));
        dataWord.add(new DataWord("Punjab National Bank", "Shastri Nagar, Near Pital Factory",R.drawable.atm_machine));
        dataWord.add(new DataWord("Punjab National Bank", "F-27, Gautam Marg, Vaishali Nagar",R.drawable.atm_machine));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_atm);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
