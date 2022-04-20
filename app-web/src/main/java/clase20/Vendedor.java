package clase20;

public class Vendedor {
	private Long id;
	private String nombre;
	private Integer sucursal;

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getSucursal() {
		return sucursal;
	}

	public Vendedor(String siguienteLinea) {
		if (siguienteLinea != null) {
			String[] arrayVendedor = siguienteLinea.split("\\|");
			if (arrayVendedor.length == 3) {
				this.setId(arrayVendedor[0]);
				this.setNombre(arrayVendedor[1]);
				this.setSucursal(arrayVendedor[2]);
			}
		}
	}

	private void setSucursal(String sucursal) {
		if (sucursal != null) {
			this.sucursal = Integer.parseInt(sucursal);
		} else {
			System.err.println("invalid_vendor_branch");
		}
	}

	private void setId(String idStr) {
		if (idStr != null && !idStr.isBlank()) {
			this.id = Long.parseLong(idStr);
		} else {
			System.err.println("invalid_vendor_id");
		}

	}

	private void setNombre(String nombre) {
		if (nombre != null) {
			this.nombre = nombre.toUpperCase();
		} else {
			System.err.println("invalid_vendor_name");
		}

	}

	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", nombre=" + nombre + ", sucursal=" + sucursal + "]";
	}
	
	

}
