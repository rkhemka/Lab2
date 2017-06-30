package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rajat on 6/29/2017.
 */

public class ForecastAdapter extends  RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
    // CompletedTODO (15) Add a class file called ForecastAdapter
    // CompletedTODO (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

    private String[] mWeatherData;

    public ForecastAdapter(){

    }

    // TODO (24) Override onCreateViewHolder
    // TODO (25) Within onCreateViewHolder, inflate the list item xml into a view
    // TODO (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter


    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {

        String weatherForThisDay = mWeatherData[position];
        holder.mWeatherTextView.setText(weatherForThisDay);


    }

    @Override
    public int getItemCount() {
        if (null == mWeatherData) return 0;
        return mWeatherData.length;

    }

    // CompletedTODO (23) Create a private string array called mWeatherData

    // TODO (47) Create the default constructor (we will pass in parameters in a later lesson)


    // TODO (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // TODO (17) Extend RecyclerView.ViewHolder

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{

        // CompletedTODO (18) Create a public final TextView variable called mWeatherTextView

        // CompletedTODO (19) Create a constructor for this class that accepts a View as a parameter
        // CompletedTODO (20) Call super(view) within the constructor for ForecastAdapterViewHolder
        // CompletedTODO (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
        // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////

        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View view) {
            super(view);
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }



    }

    // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }



}
