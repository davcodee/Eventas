package com.example.deyvi.eventas.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deyvi.eventas.Adapters.ArticuloAdapter;
import com.example.deyvi.eventas.POJO.Articulo;
import com.example.deyvi.eventas.R;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A simple {@link Fragment} subclass.
 */
public class VentasFragment extends Fragment {


	public VentasFragment() {}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_ventas, container, false);

		/*Buscamos nuesto recycler view*/
		RecyclerView rvVentas = (RecyclerView) view.findViewById(R.id.rvVentas);

		/*Le decimos que se comporte como una lista*/
		LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
		linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

		/*Agregamos el comportamiento a nuestro recyclerView*/
		rvVentas.setLayoutManager(linearLayoutManager);

		/*Creamos nuestro adaptador*/

		ArticuloAdapter adapter =
				new ArticuloAdapter(addVentas(),R.layout.cardview_articulo,getActivity());

		rvVentas.setAdapter(adapter);
		return  view;
	}

	/*Método que agrega elementos a nuestra lista*/
	public LinkedList<Articulo> addVentas(){
		LinkedList<Articulo> articulos = new LinkedList<>();

		articulos.add(new Articulo("7506135701971",
				6,
				10,
				"18/01/2017",
				"20/11/2017"));

		articulos.add(new Articulo("7506135704934",
				6,
				150,
				"20/01/2001",
				"20/11/2017"));

		articulos.add(new Articulo("8850781700048",
				163,
				200,
				"15/03/2001",
				"20/11/2017"));

		articulos.add(new Articulo("8716100451889",
				420,
				10,
				"01/02/2004",
				"20/11/2017"));
		articulos.add(new Articulo("8850781703551",
				163,
				25,
				"03/03/2008",
				"20/11/2017"));

		articulos.add(new Articulo("757528025496",
				420,
				30,
				"04/05/2005",
				"20/11/2017"));

		articulos.add(new Articulo("",
				6,
				150,
				"",
				""));

		articulos.add(new Articulo("757528025502",
				420,
				8,
				"05/10/2007",
				"20/11/2017"));

		articulos.add(new Articulo("757528025519",
				420,
				6,
				"10/01/2009",
				"20/11/2017"));

		articulos.add(new Articulo("757528025878",
				420,
				3,
				"15/02/2008",
				"20/11/2017"));

		articulos.add(new Articulo("758104000104",
				35,
				5,
				"21/02/2003",
				"20/11/2017"));

		articulos.add(new Articulo("758104001712",
				35,
				11,
				"22/02/2004",
				"20/11/2017"));


		articulos.add(new Articulo("758104001972",
				35,
				2,
				"02/05/2010",
				"20/11/2017"));


		return  articulos;
	}

}
