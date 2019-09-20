package net.itinajero.app.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ARPFOL")
public class Arpfol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private IdArpfol idArpfol;
	
	private String no_cliente;
	private String tipo_arti;
	private String bodega;
	private Double cant_comp;
	private Double cant_solicitada;
	private Double cant_reser;
    private Double precio;
	private String tipo_doc;
	private String no_factu;
	private String estado;
	
	@ManyToOne
	@JoinColumns({
				@JoinColumn(name = "no_cia", insertable=false, updatable=false),
				@JoinColumn(name = "no_orden",insertable=false, updatable=false)
			})
	private Arpfoe arpfoe;

	public Arpfoe getArpfoe() {
		return arpfoe;
	}
	public void setArpfoe(Arpfoe arpfoe) {
		this.arpfoe = arpfoe;
	}
	public IdArpfol getIdArpfol() {
		return idArpfol;
	}
	public void setIdArpfol(IdArpfol idArpfol) {
		this.idArpfol = idArpfol;
	}
	public String getNo_cliente() {
		return no_cliente;
	}
	public void setNo_cliente(String no_cliente) {
		this.no_cliente = no_cliente;
	}
	public String getTipo_arti() {
		return tipo_arti;
	}
	public void setTipo_arti(String tipo_arti) {
		this.tipo_arti = tipo_arti;
	}
	public String getBodega() {
		return bodega;
	}
	public void setBodega(String bodega) {
		this.bodega = bodega;
	}
	public Double getCant_comp() {
		return cant_comp;
	}
	public void setCant_comp(Double cant_comp) {
		this.cant_comp = cant_comp;
	}
	public Double getCant_solicitada() {
		return cant_solicitada;
	}
	public void setCant_solicitada(Double cant_solicitada) {
		this.cant_solicitada = cant_solicitada;
	}
	public Double getCant_reser() {
		return cant_reser;
	}
	public void setCant_reser(Double cant_reser) {
		this.cant_reser = cant_reser;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getTipo_doc() {
		return tipo_doc;
	}
	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}
	public String getNo_factu() {
		return no_factu;
	}
	public void setNo_factu(String no_factu) {
		this.no_factu = no_factu;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Arpfol [idArpfol=" + idArpfol + ", no_cliente=" + no_cliente + ", tipo_arti=" + tipo_arti + ", bodega="
				+ bodega + ", cant_comp=" + cant_comp + ", cant_solicitada=" + cant_solicitada + ", cant_reser="
				+ cant_reser + ", precio=" + precio + ", tipo_doc=" + tipo_doc + ", no_factu=" + no_factu + ", estado="
				+ estado + ", arpfoe=" + arpfoe + "]";
	}

    
		
		

}
