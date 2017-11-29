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
import java.util.LinkedList;

/**
 * Created by deyvi on 28/11/2017.
 */

public class ArticuloAdapter extends  RecyclerView.Adapter<ArticuloAdapter.ArticuloViewHolder>  {

	private LinkedList<Articulo> articulos;
	private  int                recurso;
	private Activity            activity;

	public ArticuloAdapter(LinkedList<Articulo> articulos, int recurso, Activity activity) {
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

		holder.tvID.setText(articulo.getId());
		holder.tvSection.setText("" + articulo.getSection());
		holder.tvVentas.setText("" + articulo.getVendidos());
		holder.tvAlta.setText(articulo.getAlta());
		holder.tvMovto.setText(articulo.getMovto());
	}

	@Override
	public int getItemCount() {
		return articulos.size();
	}

	public class ArticuloViewHolder extends RecyclerView.ViewHolder{

		private TextView tvID;
		private TextView tvSection;
		private TextView tvVentas;
		private TextView tvAlta;
		private TextView tvMovto;


		public ArticuloViewHolder(View itemView) {
			super(itemView);

			tvID          =(TextView)itemView.findViewById(R.id.tvID);
			tvSection     =(TextView)itemView.findViewById(R.id.tvSection);
			tvVentas      =(TextView)itemView.findViewById(R.id.tvVentas);
			tvAlta        =(TextView)itemView.findViewById(R.id.tvAlta);
			tvMovto       =(TextView)itemView.findViewById(R.id.tvMovto);


		}
	}
}
