package com.example.deyvi.eventas.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deyvi.eventas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InventarioFragment extends Fragment {


	public InventarioFragment() {}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_inventario, container, false);
	}

}
