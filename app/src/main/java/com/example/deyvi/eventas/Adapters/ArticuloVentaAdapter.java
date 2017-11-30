package com.example.deyvi.eventas.Adapters;

import android.app.Activity;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.deyvi.eventas.POJO.ArticuloVenta;
import com.example.deyvi.eventas.R;

import org.w3c.dom.Text;

import java.security.PrivateKey;
import java.util.LinkedList;

/**
 * Created by deyvi on 29/11/2017.
 */

public class ArticuloVentaAdapter extends RecyclerView.Adapter<ArticuloVentaAdapter.ArticuloVentaViewHolder> {

	/*Lista  de ventas*/
	private LinkedList<ArticuloVenta> ventas;
	/*Recurso guia para dibujar nuestro cardView*/
	private  int recurso;
	/*Contexto*/
	private Activity activity;

	public ArticuloVentaAdapter(LinkedList<ArticuloVenta> ventas, int recurso, Activity activity) {
		this.ventas = ventas;
		this.recurso = recurso;
		this.activity = activity;
	}

	@Override
	public ArticuloVentaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

		View view = LayoutInflater.from(parent.getContext()).inflate(recurso,parent,false);
		return  new ArticuloVentaViewHolder(view);
	}

	@Override
	public void onBindViewHolder(ArticuloVentaViewHolder holder, int position) {

		ArticuloVenta articulo = ventas.get(position);

		holder.imgArticuloVenta.setImageDrawable(articulo.getImage());
		holder.tvVentaName.setText(articulo.getName());
		holder.tvArtiVentaID.setText(articulo.getId());
		holder.tvVentaCosto.setText("" + articulo.getVenta());
		holder.tvVentaVendidos.setText("" + articulo.getCosto());
	}

	@Override
	public int getItemCount() {
		return ventas.size();
	}

	public class ArticuloVentaViewHolder extends  RecyclerView.ViewHolder{

	public ImageView imgArticuloVenta;
	public TextView tvVentaName;
	public TextView tvArtiVentaID;
	public TextView tvVentaCosto;
	public TextView tvVentaVendidos;

	public ArticuloVentaViewHolder(View itemView) {
		super(itemView);

		imgArticuloVenta = (ImageView) itemView.findViewById(R.id.imgArticuloVenta);
		tvVentaName     = (TextView)itemView.findViewById(R.id.tvVentaName);
		tvArtiVentaID   =(TextView)itemView.findViewById(R.id.tvArtiVentaID);
		tvVentaCosto    = (TextView)itemView.findViewById(R.id.tvVentaCosto);
		tvVentaVendidos = (TextView)itemView.findViewById(R.id.tvVentaVendidos);
	}
}

}
