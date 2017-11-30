package com.example.deyvi.eventas.POJO;

import android.graphics.drawable.Drawable;

/**
 * Created by deyvi on 28/11/2017.
 */

public class ArticuloVenta {
	private String   name;
	private Drawable image;
	private String id;

	private int section;
	private int    costo;
	private int     venta;
	private String alta;

	public ArticuloVenta(String name, Drawable image, String id, int section, int costo, int venta, String alta) {
		this.name = name;
		this.image = image;
		this.id = id;
		this.section = section;
		this.costo = costo;
		this.venta = venta;
		this.alta = alta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Drawable getImage() {
		return image;
	}

	public void setImage(Drawable image) {
		this.image = image;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getVenta() {
		return venta;
	}

	public void setVenta(int venta) {
		this.venta = venta;
	}

	public String getAlta() {
		return alta;
	}

	public void setAlta(String alta) {
		this.alta = alta;
	}
}
