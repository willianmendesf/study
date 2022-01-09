package br.com.willianmendesf.javastore.jdbc;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author: willianmendesf
 */
public class ConnectionFactory {

	public Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/BDVENDAS","root","root");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
