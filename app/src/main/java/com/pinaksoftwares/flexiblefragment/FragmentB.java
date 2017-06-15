package com.pinaksoftwares.flexiblefragment;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class FragmentB extends Fragment {


    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two,container,false);
        textView = (TextView) view.findViewById(R.id.tv_fragment_main_textview);
        return view;
    }


    public void changeData(int index){
        Resources resources = getResources();
        String[] description = resources.getStringArray(R.array.list_description);
        if (description[index] != null && textView != null)
            textView.setText(description[index]);
        else
            Toast.makeText(getActivity(), "Index is null" + description[index], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
