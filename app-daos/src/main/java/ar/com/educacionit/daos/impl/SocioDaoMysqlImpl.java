package ar.com.educacionit.daos.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.educacionit.daos.SocioDao;
import ar.com.educacionit.domain.Socio;

public class SocioDaoMysqlImpl extends JDBCBaseDao<Socio> implements SocioDao {

	public SocioDaoMysqlImpl() {
		super("Socio");
	}

	@Override
	public String getSaveSQL() {
		return "(APELLIDO,NOMBRE, CODIGO) VALUES (?,?,?)";
	}

	@Override
	public void saveData(Socio entity, PreparedStatement st) throws SQLException {
		st.setString(1, entity.getApellido());
		st.setString(2, entity.getNombre());
		st.setString(3, entity.getCodigo());
	}

	public Socio fromResultSetToEntity(ResultSet rs) throws SQLException {
		Long id = rs.getLong("id");
		String apellido = rs.getString("apellido");
		String nombre = rs.getString("nombre");
		String codigo = rs.getString("codigo");
		return new Socio(id, apellido, nombre, codigo);
	}

	@Override
	public void updateData(Socio entity, PreparedStatement st) throws SQLException {

	}

	@Override
	public String getUpdateSQL(Socio entity) {
		return "";
	}

}
