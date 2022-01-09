module br.com.willianmendesf.javastore {
	requires javafx.controls;
	requires javafx.fxml;
    requires java.desktop;
    requires java.logging;
    requires java.sql;


    opens br.com.willianmendesf.javastore to javafx.fxml;
	exports br.com.willianmendesf.javastore;
}
