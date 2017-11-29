package com.example.deyvi.eventas.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deyvi.eventas.Adapters.ArticuloInventarioAdapter;
import com.example.deyvi.eventas.POJO.ArticuloInventario;
import com.example.deyvi.eventas.R;

import java.util.LinkedList;

/**
 * A simple {@link Fragment} subclass.
 */
public class InventarioFragment extends Fragment {


	public InventarioFragment() {}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_inventario, container, false);

		RecyclerView rvInventario = (RecyclerView)view.findViewById(R.id.rvInventario);

		LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
		linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

		rvInventario.setLayoutManager(linearLayoutManager);

		ArticuloInventarioAdapter adapter = new ArticuloInventarioAdapter
				(addArticulo(),R.layout.cardview_articulo_inventario,getActivity());

		rvInventario.setAdapter(adapter);
		return view;
	}

	private LinkedList<ArticuloInventario> addArticulo(){
		LinkedList<ArticuloInventario> inventarios = new LinkedList<>();

		inventarios.add(new ArticuloInventario("7506135701971",
				getResources().getDrawable(R.drawable.box)
				,
				100
				,100,
				200,
				"15/01/2017",
				"20/11/2017"));

		inventarios.add(new ArticuloInventario("7506135704934\n",
				getResources().getDrawable(R.drawable.box)
				,
				200
				,250,
				300,
				"20/01/2001",
				"20/11/2017"));

		inventarios.add(new ArticuloInventario("8850781700048",
				getResources().getDrawable(R.drawable.box)
				,
				300
				,200,
				500,
				"15/02/2001",
				"20/11/2017"));

		inventarios.add(new ArticuloInventario("8716100451889",
				getResources().getDrawable(R.drawable.box)
				,
				400
				,100,
				600,
				"01/01/2004",
				"20/11/2017"));
		inventarios.add(new ArticuloInventario("8850781703551\n",
				getResources().getDrawable(R.drawable.box)
				,
				250
				,600,
				800,
				"03/03/2008",
				"20/11/2017"));




		return inventarios;
	}

}
