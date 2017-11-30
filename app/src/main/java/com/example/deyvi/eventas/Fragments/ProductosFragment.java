package com.example.deyvi.eventas.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deyvi.eventas.Adapters.ArticuloVentaAdapter;
import com.example.deyvi.eventas.POJO.Articulo;
import com.example.deyvi.eventas.POJO.ArticuloVenta;
import com.example.deyvi.eventas.R;

import java.util.LinkedList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductosFragment extends Fragment {


	public ProductosFragment() {}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_productos, container, false);
		/*Buscamos nuestra lista por ID*/
		RecyclerView rvProductos = (RecyclerView)view.findViewById(R.id.rvProductos);

		/*Agregamos el comportamiento */
		LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(getContext());
		linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

		rvProductos.setLayoutManager(linearLayoutManager);

		ArticuloVentaAdapter adapter = new ArticuloVentaAdapter(addVentas(),R.layout.cardview_articulo_venta,getActivity());

		rvProductos.setAdapter(adapter);


		return view;
	}

	/*Método que agrega los elementos a mostrar en la lista*/
	private LinkedList<ArticuloVenta> addVentas() {

		 LinkedList<ArticuloVenta>  ventas = new LinkedList<>();

		 ventas.add(new ArticuloVenta("Lavatrastes Liquido",
				 getResources().getDrawable(R.drawable.savia),
				 "7506135701971",
				 6,
				 15,
				 19,
				 "15/01/2017"));

		ventas.add(new ArticuloVenta("SUAVIZANTE DE TELAS FLORAL SIN ENJUAGUE ",
				getResources().getDrawable(R.drawable.suavizante),
				"7506135704934",
				6 ,
				26,
				39,
				"20/01/2001"));

		ventas.add(new ArticuloVenta("Crema de coco",
				getResources().getDrawable(R.drawable.cremacoco),
				"8850781700048",
				163,
				11,
				18,
				"15/02/2001"));

		ventas.add(new ArticuloVenta("Gomitas Agriduces de fresa fascini",
				getResources().getDrawable(R.drawable.gomitasfascini),
				"8716100451889",
				420,
				8,
				14,
				"01/01/2004"
				));

		ventas.add(new ArticuloVenta("Crema de Coco",
				getResources().getDrawable(R.drawable.aguacoco),
				"8850781703551",
				163,
				7,
				12,
				"03/03/2008"
				));
		ventas.add(new ArticuloVenta("Gomilocas caritas",
				getResources().getDrawable(R.drawable.gomilocas)
				,"757528025496",
				420,
				6,
				10,
				"04/04/2005"));
		return ventas;

	}

}
