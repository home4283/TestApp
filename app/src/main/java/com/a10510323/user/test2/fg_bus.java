package com.a10510323.user.test2;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class fg_bus extends Fragment{
    private Spinner buslist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fg_bus, container, false);
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View v = getView();
        buslist = v.findViewById(R.id.buslist);

        ArrayAdapter<CharSequence>list = ArrayAdapter.createFromResource(getActivity(),R.array.bus,android.R.layout.simple_spinner_dropdown_item);
        buslist.setAdapter(list);
    }
}
