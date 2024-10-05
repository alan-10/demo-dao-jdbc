package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

	private Connection connection = null;

	public SellerDaoJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void insert(Seller seller) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Seller seller) {
		// TODO Auto-generated method stub

	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement preparedStatemen = null;
		ResultSet resultSet = null;

		try {

			this.connection.setAutoCommit(false);

			preparedStatemen = this.connection
					.prepareStatement("SELECT seller.*,  department.name as DepName " + "FROM seller JOIN "
							+ "department ON seller.DepartmentId = " + "department.Id WHERE seller.Id = ?");

			preparedStatemen.setInt(1, id);

			resultSet = preparedStatemen.executeQuery();

			if (!resultSet.next()) {
				return null;
			}

			Department department = new Department(resultSet.getInt("DepartmentId"), resultSet.getString("DepName"));

			return new Seller(resultSet.getInt("Id"), resultSet.getString("name"), resultSet.getString("email"),
					resultSet.getDouble("baseSalary"), resultSet.getDate("birthDate"), department);

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}

	@Override
	public void delteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Seller> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
