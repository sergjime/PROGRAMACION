package conexionbeer;

import java.sql.*;

public class ConsultarBD {

    public void ConsultarBD() throws SQLException {
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/beer", "root", "admingenius09");
        Statement miStatement = miConexion.createStatement();
        ResultSet miResultado = miStatement.executeQuery("SELECT * FROM serves");
        ResultSetMetaData columnas = miResultado.getMetaData();

        while (miResultado.next()) {
            System.out.println("\n");
            for (int i = 1; i <= columnas.getColumnCount(); i++) {
                if (i == columnas.getColumnCount()) {
                    System.out.print(miResultado.getString(i));
                } else {
                    System.out.print(miResultado.getString(i) + " | ");
                }
            }
        }
        System.out.println("\n");
    }
}
