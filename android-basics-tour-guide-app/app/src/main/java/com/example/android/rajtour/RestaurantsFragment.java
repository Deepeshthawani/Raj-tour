package com.example.android.rajtour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.rajtour.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord("Baluchi", "The Lalit,2B&2C,Jagatpura Road,Jaipur", R.drawable.restaurant_food));
        dataWord.add(new DataWord("Dragon House", "MI Road,Khasa Kothi Circle,Jaipur", R.drawable.restaurant_dish));
        dataWord.add(new DataWord("Midtown Multicuisine Restaurant", "Kishore Niwas,Near Bank of Baroda,Jaipur", R.drawable.restaurant_food));
        dataWord.add(new DataWord("Survarna Mahal", "Rambagh Palace,Bhawani Singh Road,Jaipur", R.drawable.restaurant_dish));
        dataWord.add(new DataWord("Handi Restaurant", "Opposite GPO,MI Road,Jaipur", R.drawable.restaurant_dish));
        dataWord.add(new DataWord("Niros", "MI Road,Panch Batti,C Scheme,Ashok Nagar,Jaipur", R.drawable.restaurant_food));
        dataWord.add(new DataWord("Natraj Restaurant", "Mirza Ismail Road,Panch Batti,C Scheme,Jaipur", R.drawable.restaurant_dish));
        dataWord.add(new DataWord("Virasat Restaurant", "Plot-B,Shakar Marg,Near 22 Godam Circle,Jaipur", R.drawable.restaurant_food));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.color_restaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
