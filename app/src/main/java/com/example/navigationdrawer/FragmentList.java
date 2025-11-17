package com.example.navigationdrawer;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.navigationdrawer.placeholder.PlaceholderContent;

/**
 * A fragment representing a list of Items.
 */
public class FragmentList extends ListFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] items = {
                "Item 1", "Item 2", "Item 3", "Item 4",
                "Item 5", "Item 6", "Item 7", "Item 8",
                "Item 9", "Item 10"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                items
        );
        setListAdapter(adapter);
    }
}