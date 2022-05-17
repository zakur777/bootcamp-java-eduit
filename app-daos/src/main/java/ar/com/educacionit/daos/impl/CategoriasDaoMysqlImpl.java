package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.github.javafaker.Faker;

import ar.com.educacionit.daos.CategoriasDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.DuplicatedException;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Categorias;

public class CategoriasDaoMysqlImpl extends JDBCBaseDao<Categorias> implements CategoriasDao {

	// private Connection con;

	public CategoriasDaoMysqlImpl() {
		super("categorias");
	}

	@Override
	public void save(Categorias Categorias) throws DuplicatedException, GenericException {// ctrl+f

		// con
		// st
		// rs

		try (Connection con2 = AdministradorDeConexiones.obtenerConexion()) {
			StringBuffer sql = new StringBuffer(
					"INSERT INTO CategoriasS (TITULO, CODIGO, PRECIO, CATEGORIAS_ID, MARCAS_ID, FECHA_CREACION, STOCK) VALUES(");
			sql.append("?,?,?,?,?,?,?)");

			try (PreparedStatement st = con2.prepareStatement(sql.toString(),
					PreparedStatement.RETURN_GENERATED_KEYS)) {

				st.execute();

				try (ResultSet rs = st.getGeneratedKeys()) {
					if (rs.next()) {
						Long id = rs.getLong(1);
						Categorias.setId(id);
					}

				}

			}
		} catch (SQLException se) {
			if (se instanceof SQLIntegrityConstraintViolationException) {
				throw new DuplicatedException("No se ha podido insertar el Categorias, integridad de datos violada",
						se);
			}
			throw new GenericException(se.getMessage(), se);
		} catch (GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		}
	}

	public void saveBatch() throws DuplicatedException, GenericException {// ctrl+f

		try (Connection con2 = AdministradorDeConexiones.obtenerConexion()) {
			StringBuffer sql = new StringBuffer("INSERT INTO CATEGORIAS (DESCRIPCION, HABILITADA) VALUES(");
			sql.append("?,?)");

			try (PreparedStatement st = con2.prepareStatement(sql.toString())) {
				System.out.println("Conected");

				Faker fake = new Faker();

				for (int i = 0; i < 11; i++) {
					st.setString(1, fake.commerce().department());
					st.setLong(2, fake.number().numberBetween(1, 1));
					st.addBatch();
				}

				int[] executeBatch = st.executeBatch();
				System.out.println("Rows impacted " + executeBatch.length);

				System.out.println("records persisted");
				PreparedStatement result = con2.prepareStatement("SELECT * FROM CATEGORIAS");
				ResultSet rs = result.executeQuery();

				while (rs.next()) {
					System.out.printf("\nid [%d] description [%s] habilitada [%d] ", rs.getLong(1), rs.getString(2),
							rs.getLong(3));

				}

			}
		} catch (SQLException se) {
			if (se instanceof SQLIntegrityConstraintViolationException) {
				throw new DuplicatedException("No se ha podido insertar el Categorias, integridad de datos violada",
						se);
			}
			throw new GenericException(se.getMessage(), se);
		} catch (GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		}
	}

	@Override
	public void update(Categorias CategoriasToUpdate) throws GenericException {
		StringBuffer sql = new StringBuffer("UPDATE CategoriasS SET ");

		sql = new StringBuffer(sql.substring(0, sql.length() - 1));

		sql.append(" where id=?");

		try (Connection con2 = AdministradorDeConexiones.obtenerConexion()) {

			try (PreparedStatement st = con2.prepareStatement(sql.toString())) {

				// puedo setear atributo=valor con el tipo correcto

				st.setLong(7, CategoriasToUpdate.getId());

				st.execute();// alt+shift+m
			}
		} catch (GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		} catch (SQLException se) {
			throw new GenericException(se.getMessage(), se);
		}
	}

	public Categorias fromResultSetToEntity(ResultSet rs) throws SQLException {
		Long idCategorias = rs.getLong("id");
		String descripcion = rs.getString("descripcion");
		Long habilitada = rs.getLong("habilitada");
		return new Categorias(idCategorias, descripcion, habilitada);
	}

}
