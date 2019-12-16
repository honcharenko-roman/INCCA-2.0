package com.android.odessatourguide.BuildingsInfoGrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.android.odessatourguide.R;
import com.android.odessatourguide.SlideNavigationMenu.ResideMenu;


public class BuildingMainInfoFragment extends Fragment {

    private View parentView;
    private ResideMenu resideMenu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.buldings_main_info, container, false);
        return parentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        GridView gridView = (GridView) getView().findViewById(R.id.grid_view);
        gridView.setBackgroundResource(R.drawable.fountain);

        gridView.setAdapter(new ImageAdapter(getContext()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Intent i = new Intent(getContext(), FullInfoActivity.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }

}
