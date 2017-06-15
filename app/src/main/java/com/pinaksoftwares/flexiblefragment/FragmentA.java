package com.pinaksoftwares.flexiblefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{


    ListView list;
    Communicator communicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = (ListView) getActivity().findViewById(R.id.lv_fragment_main_list);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.list,android.R.layout.simple_expandable_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void setCommunicator(Communicator communicator){
        this.communicator = communicator;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.respond(position);
    }

    public interface Communicator{
        public void respond(int index);
    }
}
