package com.example.kemmerson.samuel.meusunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Weds - Cloudy - 72/63",
                "Thurs - Asteroids - 75/65",
                "Fri - Heavy Rain - 65/65",
                "Sat - HELP TRAPPED IN WEATHERSTATION - 60/51",
                "Sun - Sunny - 80/68"

        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray));

       ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(
                  getActivity(),
                  R.layout.list_item_forecast,
                  R.id.list_item_forecast_textview,

                  weekForecast
                );

        return inflater.inflate(R.layout.fragment_main, container, false);

    }
}
