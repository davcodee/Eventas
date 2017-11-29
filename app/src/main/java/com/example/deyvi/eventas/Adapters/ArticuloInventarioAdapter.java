package com.example.deyvi.eventas.Adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.deyvi.eventas.POJO.Articulo;
import com.example.deyvi.eventas.POJO.ArticuloInventario;
import com.example.deyvi.eventas.R;

import java.util.LinkedList;

/**
 * Created by deyvi on 29/11/2017.
 */

public class ArticuloInventarioAdapter  extends RecyclerView.Adapter<ArticuloInventarioAdapter.ArticuloInventarioViewHolder> {

	private LinkedList<ArticuloInventario> inventario ;
	private int recurso;
	private Activity activity;

	public ArticuloInventarioAdapter(LinkedList<ArticuloInventario> inventario, int recurso, Activity activity) {
		this.inventario = inventario;
		this.recurso = recurso;
		this.activity = activity;
	}

	@Override
	public ArticuloInventarioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(recurso,parent,false);

		return new ArticuloInventarioViewHolder(view);
	}

	@Override
	public void onBindViewHolder(ArticuloInventarioViewHolder holder, int position) {
		ArticuloInventario inventario1 = inventario.get(position);

		holder.tvInventarioId.setText(inventario1.getId());
		holder.tvInventarioExistencia.setText("" + inventario1.getExistencia());
	}

	@Override
	public int getItemCount() {
		return inventario.size();
	}

	public class ArticuloInventarioViewHolder extends RecyclerView.ViewHolder{

		private TextView tvInventarioId;
		private TextView tvInventarioExistencia;
		public ArticuloInventarioViewHolder(View itemView) {
			super(itemView);

			tvInventarioId          = (TextView)itemView.findViewById(R.id.tvInventarioId);
			tvInventarioExistencia  =  (TextView)itemView.findViewById(R.id.tvInventarioExistencia);
		}
	}

}
