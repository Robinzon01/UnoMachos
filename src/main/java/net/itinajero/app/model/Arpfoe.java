package net.itinajero.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARPFOE")
public class Arpfoe {
	

	private String no_cia;
    @Id
	private String no_orden;
	
	private String no_cliente;
	private String no_vendedor;

	public String getNo_cia() {
		return no_cia;
	}

	public void setNo_cia(String no_cia) {
		this.no_cia = no_cia;
	}

	public String getNo_orden() {
		return no_orden;
	}

	public void setNo_orden(String no_orden) {
		this.no_orden = no_orden;
	}

	public String getNo_cliente() {
		return no_cliente;
	}

	public void setNo_cliente(String no_cliente) {
		this.no_cliente = no_cliente;
	}

	public String getNo_vendedor() {
		return no_vendedor;
	}

	public void setNo_vendedor(String no_vendedor) {
		this.no_vendedor = no_vendedor;
	}

	@Override
	public String toString() {
		return "Arpfoe [no_cia=" + no_cia + ", no_orden=" + no_orden + ", no_cliente=" + no_cliente + ", no_vendedor="
				+ no_vendedor + "]";
	}
	
	

}
