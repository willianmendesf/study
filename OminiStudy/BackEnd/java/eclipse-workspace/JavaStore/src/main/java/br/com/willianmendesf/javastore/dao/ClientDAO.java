package br.com.willianmendesf.javastore.dao;

import br.com.willianmendesf.javastore.jdbc.ConnectionFactory;
import br.com.willianmendesf.javastore.model.Client;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {

	private Connection con;

	public ClientDAO() {
		this.con = new ConnectionFactory().getConnection();
	}

	/* CREATE TABLE tb_clients (id int, name varchar(255), email varchar(255), CPF varchar(255), RG varchar(255), mobile varchar(255), phone varchar(255), CEP int, address varchar(255), addressNum int, district varchar(255), city varchar(255), complement varchar(255), UF varchar(255)); */

	// Method to List clients;
	public List<Client> listClients(){
		List<Client> listAllClients = new ArrayList<>();

		try {
			String sql = "SELECT * FROM tb_clients";
			PreparedStatement insertSql = con.prepareStatement(sql);
			ResultSet rs = insertSql.executeQuery();

			while(rs.next()) {
				Client client = new Client();

				client.setId(rs.getInt("id"));
				client.setName(rs.getString("name"));
				client.setEmail(rs.getString("email"));
				client.setCPF(rs.getString("CPF"));
				client.setRG(rs.getString("RG"));
				client.setMobile(rs.getString("mobile"));
				client.setPhone(rs.getString("phone"));
				client.setCEP(rs.getInt("CEP"));
				client.setAddress(rs.getString("address"));
				client.setAddress(rs.getString("address"));
				client.setAddressNum(rs.getInt("addressNum"));
				client.setDistrict(rs.getString("district"));
				client.setCity(rs.getString("city"));
				client.setComplement(rs.getString("complement"));
				client.setUF(rs.getString("UF"));
			}
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "OPS!, houve um erro: " + e);
		}

		return listAllClients;
	}

	// Method to register client;
	public void newClient(Client client){
		try {
			String sql = "INSERT INTO tb_clients (name, email, CPF, RG, mobile, phone, CEP, address, addressNum, district, city, complement, UF)"
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement insertSql = con.prepareStatement(sql);

			insertSql.setString(1, client.getName());
			insertSql.setString(2, client.getEmail());
			insertSql.setString(3, client.getCPF());
			insertSql.setString(4, client.getRG());
			insertSql.setString(5, client.getMobile());
			insertSql.setString(6, client.getPhone());
			insertSql.setInt(7, client.getCEP());
			insertSql.setString(8, client.getAddress());
			insertSql.setInt(9, client.getAddressNum());
			insertSql.setString(10, client.getDistrict());
			insertSql.setString(11, client.getCity());
			insertSql.setString(12, client.getComplement());
			insertSql.setString(13, client.getUF());

			insertSql.execute();
			insertSql.close();

			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "OPS!, houve um erro: " + e);
		}
	}

	// Method to register client;
	public void updateClient(){

	}

	// Method to register client;
	public void deleteClient(){

	}
}
