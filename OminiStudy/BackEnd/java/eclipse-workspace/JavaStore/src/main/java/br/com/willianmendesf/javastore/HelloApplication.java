package br.com.willianmendesf.javastore;

import br.com.willianmendesf.javastore.jdbc.ConnectionFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 320, 240);
		stage.setTitle("Hello!");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		try {
			new ConnectionFactory().getConnection();
			JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
			launch();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "OPS, houve um erro!, " + e);
		}
	}
}
