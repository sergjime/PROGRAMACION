package conexionbeer;

import java.sql.*;

public class ActualizarBD {

    public void ActualizarBD() throws SQLException {
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/beer", "root", "admingenius09");
        String actualitzaBeer = "update beer set name=? where name=?";
        PreparedStatement beer = miConexion.prepareStatement(actualitzaBeer);
        beer.setString(1, "PRUEBA");
        beer.setString(2, "Corona");
        int n = beer.executeUpdate();
        miConexion.close();
        System.out.println("ACTUALIZADA CON ÉXITO");
    }
}
