package com.example.deyvi.eventas.Adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.deyvi.eventas.POJO.Articulo;
import com.example.deyvi.eventas.R;

import java.util.ArrayList;

/**
 * Created by deyvi on 28/11/2017.
 */

public class ArticuloAdapter extends  RecyclerView.Adapter<ArticuloAdapter.ArticuloViewHolder>  {

	private ArrayList<Articulo> articulos;
	private  int                recurso;
	private Activity            activity;

	public ArticuloAdapter(ArrayList<Articulo> articulos, int recurso, Activity activity) {
		this.articulos = articulos;
		this.recurso = recurso;
		this.activity = activity;
	}



	@Override
	public ArticuloViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View v= LayoutInflater.from(parent.getContext()).inflate(recurso,parent,false);
		return new ArticuloViewHolder(v);
	}

	@Override
	public void onBindViewHolder(ArticuloViewHolder holder, int position) {
		Articulo articulo = articulos.get(position);

		holder.id.setText(articulo.getId());
		holder.section.setText(articulo.getSection());
		holder.vendidos.setText(articulo.getVendidos());
	}

	@Override
	public int getItemCount() {
		return articulos.size();
	}

	public class ArticuloViewHolder extends RecyclerView.ViewHolder{

		private TextView id;
		private TextView section;
		private TextView vendidos;


		public ArticuloViewHolder(View itemView) {
			super(itemView);

			id          =  (TextView)itemView.findViewById(R.id.tvID);
			section     =  (TextView)itemView.findViewById(R.id.tvSection);
			vendidos    =  (TextView)itemView.findViewById(R.id.tvVentas);

		}
	}
}
