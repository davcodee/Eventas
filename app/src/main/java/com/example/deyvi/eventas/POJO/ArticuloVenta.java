package com.example.deyvi.eventas.POJO;

/**
 * Created by deyvi on 28/11/2017.
 */

public class ArticuloVenta {
	private String id;
	private int    image;
	private int    section;
	private int    vendidos;
	private String alta;
	private String movto;

	public ArticuloVenta(String id, int image, int section, int vendidos, String alta, String movto) {
		this.id = id;
		this.image = image;
		this.section = section;
		this.vendidos = vendidos;
		this.alta = alta;
		this.movto = movto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getVendidos() {
		return vendidos;
	}

	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
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
