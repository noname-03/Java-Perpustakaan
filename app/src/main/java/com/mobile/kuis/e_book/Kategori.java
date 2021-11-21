package com.mobile.kuis.e_book;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Kategori extends Fragment {

    public Kategori(){
        //
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
//        View rootview = inflater.inflate(R.layout.fragment_kategori, container, false);
//    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kategori, container, false);
        ListView listview =(ListView) rootView.findViewById(R.id.list);
        final String[] items = new String[] {
                "Novel", "Umum", "Sosial", "Bahasa", "Sains Dan Matematika", "Teknologi",
                "Seni Dan Rekreasi", "Literatur Dan Sastra", "Sejarah Dan Geografi"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity().getApplicationContext(), items[i], Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}