package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Iterator;

import com.github.javafaker.Faker;

import ar.com.educacionit.daos.MarcasDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.DuplicatedException;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Marcas;

public class MarcasDaoMysqlImpl extends JDBCBaseDao<Marcas> implements MarcasDao {
	public MarcasDaoMysqlImpl() {
		super("marcas");
	}

	@Override
	public void save(Marcas marca) throws GenericException, DuplicatedException {

		try (Connection con2 = AdministradorDeConexiones.obtenerConexion()) {
			StringBuffer sql = new StringBuffer("INSERT INTO MARCAS (DESCRIPCION, HABILITADA) VALUES(");
			sql.append("?,?)");

			try (PreparedStatement st = con2.prepareStatement(sql.toString(),
					PreparedStatement.RETURN_GENERATED_KEYS)) {

				st.setString(1, marca.getDescripcion());
				st.setLong(2, marca.getHabilitada());

				st.execute();

				try (ResultSet rs = st.getGeneratedKeys()) {
					if (rs.next()) {
						Long id = rs.getLong(1);
						marca.setId(id);
					}

				}

			}
		} catch (SQLException se) {
			if (se instanceof SQLIntegrityConstraintViolationException) {
				throw new DuplicatedException("No se ha podido insertar en Marcas, integridad de datos violada", se);
			}
			throw new GenericException(se.getMessage(), se);
		} catch (GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		}

	}

	public void saveBatch() throws GenericException, DuplicatedException {
		try (Connection con2 = AdministradorDeConexiones.obtenerConexion()) {
			StringBuffer sql = new StringBuffer("INSERT INTO MARCAS (DESCRIPCION, HABILITADA) VALUES(");
			sql.append("?,?)");

			try (PreparedStatement st = con2.prepareStatement(sql.toString())) {
				System.out.println("Conected");

				Faker fake = new Faker();

				for (int i = 0; i < 11; i++) {

					st.setString(1, fake.company().name());
					st.setLong(2, fake.number().numberBetween(0, 1));
					st.addBatch();
				}

				int[] executeBatch = st.executeBatch();
				
				for(int rowsImpacted : executeBatch) {
					System.out.println("Rows impacted " + rowsImpacted);
				}

			}

			System.out.println("records persisted");
			PreparedStatement result = con2.prepareStatement("SELECT * FROM marcas");
			ResultSet rs = result.executeQuery();

			while (rs.next()) {
				System.out.printf("\nid [%d] description [%s] habilitada [%d] ", rs.getLong(1), rs.getString(2),
						rs.getLong(3));

			}
		} catch (SQLException se) {
			if (se instanceof SQLIntegrityConstraintViolationException) {
				throw new DuplicatedException("No se ha podido insertar en Marcas, integridad de datos violada", se);
			}
			throw new GenericException(se.getMessage(), se);
		} catch (GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		}

	}

	@Override
	public void update(Marcas marcaToUpdate) throws GenericException {
		StringBuffer sql = new StringBuffer("UPDATE MARCAS SET ");

		sql = new StringBuffer(sql.substring(0, sql.length() - 1));

		sql.append(" where id=?");

		try (Connection con2 = AdministradorDeConexiones.obtenerConexion()) {

			try (PreparedStatement st = con2.prepareStatement(sql.toString())) {

				// puedo setear atributo=valor con el tipo correcto

				st.setLong(7, marcaToUpdate.getId());

				st.execute();// alt+shift+m
			}
		} catch (GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		} catch (SQLException se) {
			throw new GenericException(se.getMessage(), se);
		}

	}

	@Override
	public Marcas fromResultSetToEntity(ResultSet rs) throws SQLException {
		Long idMarcas = rs.getLong("id");
		String descripcion = rs.getString("descripcion");
		Long habilitada = rs.getLong("habilitada");
		return new Marcas(idMarcas, descripcion, habilitada);
	}

}
