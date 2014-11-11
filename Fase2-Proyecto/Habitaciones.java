import javax.swing.table.AbstractTableModel;;

public class Habitaciones {

	private int Numero;
	private String Nopiso;
	private String Descripcion;
	private String Caracteristicas;
	private String Estado;
	private String Tipohabitacion;
	private Double preciodiario;


	public Habitaciones(){
	}

	public Habitaciones(int numero, String nopiso, String descripcion,
			String caracteristicas, String estado, String tipohabitacion,
			Double preciodiario) {
		this.Numero = numero;
		this.Nopiso = nopiso;
		this.Descripcion = descripcion;
		this.Caracteristicas = caracteristicas;
		this.Estado = estado;
		this.Tipohabitacion = tipohabitacion;
		this.preciodiario = preciodiario;
	}

	public Integer totalregistros;
	
/*public DefaultTableModel1 mostrar(String Buscar) {
		DefaultTableModel1 modelo;
		}*/
	
	private int getNumero() {
		return Numero;
	}
	private void setNumero(int numero) {
		Numero = numero;
	}
	private String getNopiso() {
		return Nopiso;
	}
	private void setNopiso(String nopiso) {
		Nopiso = nopiso;
	}
	private String getDescripcion() {
		return Descripcion;
	}
	private void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	private String getCaracteristicas() {
		return Caracteristicas;
	}
	private void setCaracteristicas(String caracteristicas) {
		Caracteristicas = caracteristicas;
	}
	private String getEstado() {
		return Estado;
	}
	private void setEstado(String estado) {
		Estado = estado;
	}
	private String getTipohabitacion() {
		return Tipohabitacion;
	}
	private void setTipohabitacion(String tipohabitacion) {
		Tipohabitacion = tipohabitacion;
	}


}
