package clase20;

import java.util.Date;
import java.util.Objects;

public class Venta {

	private Long idVendedor;
	// private Vendedor vendedor;
	private Date fecha;
	private Double monto;

	public Venta(String venta) {

	}

	public Venta(Long idVendedor, Date fecha, Double monto) {
		super();
		this.idVendedor = idVendedor;
		this.fecha = fecha;
		this.monto = monto;
	}

	public Date getFecha() {
		return fecha;
	}

	public Double getMonto() {
		return monto;
	}

	public Long getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Long idVendedor) {
		this.idVendedor = idVendedor;
	}

	@Override
	public String toString() {
		return "Venta [idVendedor=" + idVendedor + ", fecha=" + fecha + ", monto=" + monto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, idVendedor, monto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return this.idVendedor.equals(other.getIdVendedor());
	}

}
