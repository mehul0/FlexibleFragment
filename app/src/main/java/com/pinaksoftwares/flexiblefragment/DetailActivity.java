package com.pinaksoftwares.flexiblefragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);

        android.app.FragmentManager manager = getFragmentManager();
        FragmentB fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment2);
        //FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        if (fragmentB != null)
            fragmentB.changeData(index);
    }
}
