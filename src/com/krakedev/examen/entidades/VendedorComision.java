package com.krakedev.examen.entidades;

public class VendedorComision {

    private String cedula;
    private String tipo;
    private int numeroVentas;
    private double comisionPorVenta;

    public VendedorComision(String cedula, String tipo) {
        this.cedula = cedula;
        this.tipo = tipo;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public void setComisionPorVenta(double comisionPorVenta) {
        this.comisionPorVenta = comisionPorVenta;
    }

    public double calcularSueldo() {
        return numeroVentas * comisionPorVenta;
    }

	public void setSueldoFijo(double d) {
		// TODO Auto-generated method stub
		
	}
}