package com.example.deyvi.eventas.POJO;

import android.graphics.drawable.Drawable;

/**
 * Created by deyvi on 28/11/2017.
 */

public class ArticuloInventario {
	private String id;
	private Drawable image;
	private int  existencia;
	private int stock;
	private int inv_fisico;
	private String alta;
	private String movto;


	public ArticuloInventario(String id, Drawable image, int existencia, int stock, int inv_fisico, String alta, String movto) {
		this.id = id;
		this.image = image;
		this.existencia = existencia;
		this.stock = stock;
		this.inv_fisico = inv_fisico;
		this.alta = alta;
		this.movto = movto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Drawable getImage() {
		return image;
	}

	public void setImage(Drawable image) {
		this.image = image;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getInv_fisico() {
		return inv_fisico;
	}

	public void setInv_fisico(int inv_fisico) {
		this.inv_fisico = inv_fisico;
	}

	public String getAlta() {
		return alta;
	}

	public void setAlta(String alta) {
		this.alta = alta;
	}

	public String getMovto() {
		return movto;
	}

	public void setMovto(String movto) {
		this.movto = movto;
	}
}
