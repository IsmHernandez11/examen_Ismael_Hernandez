package com.krakedev.examen.services;

import java.util.ArrayList;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;

public class AdminVentas {
	private ArrayList<Vendedor> vendedores;

	public AdminVentas() {
		vendedores = new ArrayList<Vendedor>();
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public void agregar(Vendedor vendedor) {
		vendedores.add(vendedor);
	}

	public Double calcularSueldo(String cedula) {
		for (Vendedor vendedor : vendedores) {
			if (vendedor.getCedula().equals(cedula)) {
				return vendedor.calcularSueldo();
			}
		}
		return null;
	}

	public void agregar(VendedorComision vendedorComision) {
		// TODO Auto-generated method stub
		
	}
}