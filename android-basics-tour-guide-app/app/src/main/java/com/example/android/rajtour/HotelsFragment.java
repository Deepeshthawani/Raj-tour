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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord("Rambagh Palace", "Bhawani Singh Road,Jaipur", R.drawable.hotel));
        dataWord.add(new DataWord("Red Fox Hotel", "Opp. MNIT college,Jaipur", R.drawable.hotel));
        dataWord.add(new DataWord("Hotal Clarks Amer", "Opp. Fortis Hospital,Jaipur", R.drawable.hotel));
        dataWord.add(new DataWord("Radisson Blu Jaipur", "Tonk Road,Jaipur", R.drawable.hotel));
        dataWord.add(new DataWord("The Raj Palace", "Jorawer Singh Road,Jaipur", R.drawable.hotel));
        dataWord.add(new DataWord("Taj Jai Mahal Palace ", "Jacob Road,Civil Lines,Jaipur", R.drawable.hotel));
        dataWord.add(new DataWord("Pearl Palace", "51,Hathroi Fort,Hari Kishan Somani Marg,Jaipur", R.drawable.hotel));
        dataWord.add(new DataWord("Umaid Bhawna Hotel", "D1-2A,Behing Collectorate,via Bank Road,Bani park,Jaipur", R.drawable.hotel));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.colorPrimaryDark);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
